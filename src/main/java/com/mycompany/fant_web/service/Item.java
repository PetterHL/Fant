/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fant_web.service;

import static com.mycompany.fant_web.service.Item.FIND_ALL_ITEMS;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import lombok.Data;

/**
 *
 * @author sigur
 *
 */
@Entity
@Data 
@NamedQuery(name = FIND_ALL_ITEMS,
        query= "select i from Item i")
public class Item {
    public static final String FIND_ALL_ITEMS = "Item.findAllItems";

    @Id
    private long id;
    private String item;
    private Date created;
    private String creator;

    public Item() {

    }

    public Item(long id, String item, String creator) {
        this.id = id;
        this.item = item;
        this.created = Date.from(java.time.LocalDateTime.now().toInstant(ZoneOffset.UTC));
        this.creator = creator;
    }

}