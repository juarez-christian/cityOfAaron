/*
 * 
 * CIT-260
 * Fall 2018
 *  Team members:  Ching Lo, Kachia Vang, Christian Juarez
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
        return name;
    }
 
    public void setName(String _name) 
    {
        this.name = _name;
    }
            
}
