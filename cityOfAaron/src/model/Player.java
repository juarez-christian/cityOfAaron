/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author _Chris_
 */

import java.io.Serializable;

// implememnts the serializable interface
public class Player implements Serializable
{ 
    // data members (or instance variables) 
    private String name;
    // contains a public, empty constructor 
    public Player() {};
    // member methods public getters and setters for each instance variable
    public String getName()
    {
        return this.name;
    }
 
    public void setName(String _name) 
    {
        name = _name;
    }
            
}
