package com.mycompany.fant_web.resources;
import com.mycompany.fant_web.authentication.Authentication;
import com.mycompany.fant_web.service.FantService;
import com.mycompany.fant_web.service.Item;

import java.net.Authenticator;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("items")
public class JavaEE8Resource {

    FantService fantService = new FantService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> getITem() {
        return fantService.getAllItems();
    }
    
    
 
}
