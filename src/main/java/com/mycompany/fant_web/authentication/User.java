/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fant_web.authentication;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Id;

/**
 *
 * @author Bruker
 */
public class User {
    
    @Id
    String userid;
    
    @JsonbTransient
    String password;
    
    String firstName;
    String middleName;
    String lastName;
    String phoneNumber;
    String email;

}
