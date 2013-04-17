package tuoyo.easy.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/content/version")
public class ContentVersionResource {

    @GET
    @Produces("application/vnd.test;version=1")
    public Response test1() {
        return Response.ok("Version 1", "application/vnd.test").build();
    }

    @GET
    @Produces("application/vnd.test;version=2")
    public Response test2() {
        return Response.ok("Version 2", "application/vnd.test").build();
    }
}
