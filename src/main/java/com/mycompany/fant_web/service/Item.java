/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fant_web.service;

import static com.mycompany.fant_web.service.Item.LIST_ALL_ITEMS;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data 
@AllArgsConstructor
@NamedQuery(name = LIST_ALL_ITEMS,
        query= "select i from Item i")

public class Item {   
    
    public Item() {

    }
    public static final String LIST_ALL_ITEMS = "Item.findAllItems";
    @Id
    public long id;
    public String item;
    public String creator;
 

   

}