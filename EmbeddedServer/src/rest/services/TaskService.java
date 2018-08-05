package rest.services;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import DBController.DBOper;
import pojo.AssignToLearners;
import pojo.Hadith;

@Path("/tasks")
public class TaskService {
	@GET
	@Path("/getTasks")
	@Produces(MediaType.APPLICATION_JSON)

	public Response getAllHadith() {
		List<Hadith> list = DBOper.getHadith();
		return Response.status(Response.Status.OK).entity(list).build();
	}
	@GET
	@Path("/refresh")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUpdatedStatus(){
		
		return null;	
	}
	//http://localhost:8080/Rabt-ul-Hadith/rest/tasks/getSimilarityAssignedTasks/3
	@GET
	@Path("/getSimilarityAssignedTasks/{learnerID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response assignTasksToLearners(@PathParam("learnerID")int learner) throws SQLException{
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		List<AssignToLearners> data = DBOper.assignSimilarityTaskLearners(learner);
		return Response.status(Response.Status.OK).entity(data).build();
	}
}