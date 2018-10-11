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

public enum TeamMember 
{
    // the members of the enumeration
    MEMBER1("Nephi", "prophet"),
    MEMBER2("Benjamin", "King"),
    MEMBER3("Helaman", "Fighter");
    
    // data members
    private String name; 
    private String title;
       
    // public constructor 
    // purpose: initializes de values of name and title
    // parameters: the name and title of the team member
    // returns: none
    
    TeamMember(String _name, String _title)
    {
        name = _name;
        title = _title;
    }
    
    // The getName() method
    // Purpose: returns the value stored in name
    // Parameters: none
    // Returns: the value stored in name
    public String getName()
    {
        return this.name;
    }

    // The getTitle() method
    // Purpose: returns the value stored in title
    // Parameters: none
    // Returns: the value stored in title
    public String getTitle()
    {
        return this.title;
    }
    
}
    