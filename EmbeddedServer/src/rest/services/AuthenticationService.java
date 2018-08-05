package rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import DBController.DBOper;
import pojo.Learners;

//http://localhost:8080/Rabt-ul-Hadith/rest/login/Authenticate/ali@google.com/ali123

@Path("/login")
public class AuthenticationService {
	@GET
	@Path("/Authenticate/{email}/{pass}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response authenticate(@PathParam("email")String email, @PathParam("pass") String pass){
		Learners learner = DBOper.authenticateMe(email,pass);
		return Response.status(Response.Status.OK).entity(learner).build();
		
	}
}
