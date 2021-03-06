/**
 * 
 */
package rest.services;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojo.Responses;
/**
 * @author AliHassan
 *
 */
//http://localhost:8080/Rabt-ul-Hadith/rest/Response/saveResponse

@Path("/Response")
public class ResponseService {
		
	@POST
	@Path("/saveResponse")
    @Produces({MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_JSON)
	public Response receiveResponse(Responses taskResponse) {
		System.out.println("+++++++++++++++++++++++++++++++++");
		if (taskResponse != null)
		{
			String result = "Track saved : " + taskResponse;
			return Response.status(201).entity(result).build();	
		}
		else
		{
			System.out.println("Null values is received");
			return null;
			
		}
    }
	
}