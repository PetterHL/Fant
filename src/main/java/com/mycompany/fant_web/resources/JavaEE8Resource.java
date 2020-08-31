package com.mycompany.fant_web.resources;
import com.mycompany.fant_web.authentication.Authentication;

import java.net.Authenticator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("auth")
public class JavaEE8Resource {
    
    @GET
    public String Authentication(){
        return new Authentication("Petter", "Petterbassen", "123", "petter@mail.com").toJson();
        }
    
    @Path ("next")
    @GET
    public String Daniel(){
        return new Authentication("Daniel", "Petterbassen", "123", "petter@mail.com").toJson();
        }
}