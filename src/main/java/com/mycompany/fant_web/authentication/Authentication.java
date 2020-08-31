/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fant_web.authentication;

import javax.json.bind.JsonbBuilder;

/**
 *
 * @author Bruker
 */
public class Authentication {
    
    public String Name;
    public String Username;
    private String Password;
    public String Email;
    
    public Authentication(){
    }

    public Authentication(String Name, String Username, String Password, String Email) {
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
    }
  
    public String toJson(){
        return JsonbBuilder.create().toJson(this);
    }

}
