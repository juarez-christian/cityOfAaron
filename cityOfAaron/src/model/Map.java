/*
* The location class file for the cityOfAaron project
 * CIT-260 
 * Fall 2018
 *  Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */
package model;

/**
 *
 * @authors Ching Lo, Kachia Vang, Christian Juarez
 */
public class Map {
    // declarations
    private int rowCount;           // this stores the number of rows
    private int colCount;           // this stores the number og columns
    private Location[][] locations; // this is a reference to a two dimensional array
                                    // of location objects
    // constructors
    // default Map constructor
    // Purpose: Set data members to default values
    // Parameters: none
    // Returns: none
    public Map() {};
    
    
    // parameterized Map constructor
    // Purpose: Sets row and column values
    //    and creates an array of Location objects
    // Parameters: row count and column count
    // Returns: none
    public Map(int _rows, int _cols)
    {
         rowCount = _rows;
         colCount = _cols;
        
         // create the array of location objects
         locations = new Location[_rows][_cols];        
    }
    
    // getters
    // The getLocation method
    // Purpose: returns the location object at the given row and column
    // Parameters: a row and column
    // Returns: a Location object
    public Location getLocation(int row, int col)
    {
        return locations[row][col];
    }
    
    
    // setter
    // The setLocation method
    // Purpose: stores a location object at the  row and column
    // Parameters: a row and column, and a reference to a location object
    // Returns: void
    public void setLocation(int row, int col, Location _location)
    {
        locations[row][col] = _location;
    } 



    
}
