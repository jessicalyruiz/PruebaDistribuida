package clients;



import dtos.ProductoDto;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/Clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@RegisterRestClient(baseUri = "http://localhost:9090")
//@RegisterRestClient
@RegisterRestClient(configKey = "ProductoRestClient")
public interface ProductoRestClient {
    @GET
    public List<ProductoDto> findAll();

    @GET
    @Path("/{id}")
    public ProductoDto findById(@PathParam("id") Integer id);

}
