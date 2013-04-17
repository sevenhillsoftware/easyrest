package tuoyo.easy.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/content/version")
public class ContentVersionResource {

    @GET
    @Path("/")
    @Produces("text/html;level=1")
    public Response testProduceHTMLLevel1Response() {
        return Response.ok().entity("text/html;level=1").build();
    }

    @GET
    @Path("/")
    @Produces("text/html;level=2")
    public Response testProduceHTMLLevel2Response() {
        return Response.ok().entity("text/html;level=2").build();
    }
}
