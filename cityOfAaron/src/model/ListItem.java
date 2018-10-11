/*
 * 
 * CIT-260
 * Fall 2018
 *  Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */
package model;

import java.io.Serializable;


/**
 *
 * @author _Chris_
 */
public class ListItem implements Serializable
{
    private String name;
    private int number;

    // public, empty constructor
    public ListItem() {};
    
    // name's getter and setter
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String _name)
    {
        this.name = _name;
    }
    
    // number's getter and setter
    public int getNumber()
    {
        return this.number;
    }
    
    public void setNumber(int _number)
    {
        this.number = _number;
    }
    
}