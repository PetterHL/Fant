package com.mycompany.fant_web.service;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * * * @author Bruker
 */
public class FantService {

    @PersistenceContext
    EntityManager em;

    @Path("item")
    public List<Item> getAllITems() {
        return em.createNamedQuery(Item.FIND_ALL_ITEMS, Item.class).getResultList();
    }
}
