/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fant_web.service;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Bruker
 */
public class FantService {
    
    
        public List<Item> getAllItems(){
           Item i1 = new Item(1, "computer", 2000);
           Item i2 = new Item(2, "car", 20000);
           List<Item> list = new ArrayList<>();
           list.add(i1);
           list.add(i2);
           return list;
        }
        
    
}
