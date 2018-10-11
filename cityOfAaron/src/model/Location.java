/*
* The location class file for the cityOfAaron project
 * CIT-260 08
 * Fall 2018
 *  Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */
package model;

/**
 *
 * @author Kachia Vang
 */
public class Location {
    
    //Variables that consist of description and symbol of location
    private String description;
    private String symbol;
    
    //public constructor
    public Location() { }
    
    public String getDescription () {
        return this.description;
    }
    public void setDescription (String _description) {
        this.description = _description;
    }
    
     public String getSymbol () {
        return this.symbol;
     }
     
         public void setSymbol (String _symbol) {
        this.symbol = _symbol;
    }
}
