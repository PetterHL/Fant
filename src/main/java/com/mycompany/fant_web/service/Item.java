/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fant_web.service;

import java.util.Date;

/**
 *
 * @author Bruker
 */
public class Item {
    
    private int itemId;
    private String itemName;
    private Date date;
    private long price;
    private String Creator;
    
    
    public Item(){
        
    }

    public Item(int itemId, String itemName, long price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDate() {
        return date;
    }

    public long getPrice() {
        return price;
    }

    public String getCreator() {
        return Creator;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setCreator(String Creator) {
        this.Creator = Creator;
    }
    
 
    
}
