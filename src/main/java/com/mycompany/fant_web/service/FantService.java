package com.mycompany.fant_web.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("fant")
@Stateless
public class FantService {

    @PersistenceContext
    EntityManager em;
    @GET
    @Path("item")
    public List<Item> getAllItems() {
        return em.createNamedQuery(Item.LIST_ALL_ITEMS,Item.class).getResultList();
    }
    
    @POST
    @Path("item") 
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createItem (@FormParam("id") long itemId, 
                @FormParam("item") String itemString,
                @FormParam("creator") String creator){
    
            System.out.println("id " + itemId);
            System.out.println("itemString " + itemString);
            
            Item item = new  Item();
            item.setId(itemId);
            item.setItem(itemString);
            item.setCreator(creator);
           
            em.persist(item);
            
        return Response.ok().build();
        
    }
    
}
