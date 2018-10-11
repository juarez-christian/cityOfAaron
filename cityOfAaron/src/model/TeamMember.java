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
public enum TeamMember 
{
    // the members of the enumeration
    VARNAME1("name", "title"),
    VARNAME2("name", "title"),
    VARNAME3("name", "title");
    // data members
    private String name;
    private String title;
       
    // The getName() method
    // Purpose: returns the value stored in name
    // Parameters: none
    // Returns: the value stored in name
    public String getName()
    {
        return name;
    }

    // The getTitle() method
    // Purpose: returns the value stored in title
    // Parameters: none
    // Returns: the value stored in title
    public String getTitle()
    {
        return title;
    }
    // public constructor 
    // purpose: initializes de values of name and title
    // parameters: the name and title of the team member
    // returns: none
    
    TeamMember(String _name, String _title)
    {
        name = _name;
        title = _title;
    }
}
    