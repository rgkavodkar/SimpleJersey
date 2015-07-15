package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by rg.kavodkar on 3/30/2015.
 */
@Path("/gateway")
public class Gateway {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getString() {
        return "Hello World";
    }

    @GET
    @Path("/getString")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDefaultString() {
        return Response.status(200).entity("Hello Jersey").build();
    }
}
