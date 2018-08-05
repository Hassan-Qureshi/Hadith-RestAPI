package rest.services;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import DBController.DBOper;
import pojo.Hadith;

//http://localhost:8080/Rabt-ul-Hadith/rest/hadith/getAll

@Path("/hadith")
public class HadithService {
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllHadith() {
		List<Hadith> list = DBOper.getHadith();
		return Response.status(Response.Status.OK).entity(list).build();
	}
//	@POST
//	@Path("/save")
//	public Response postData()
//	{
//			Request.da
//	}
	
}
