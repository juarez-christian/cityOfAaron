/*
* The location class file for the cityOfAaron project
 * CIT-260 
 * Fall 2018
 *  Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */
package model;
import java.io.Serializable;

/**
 *
 * @authors Ching Lo, Kachia Vang, Christian Juarez
 */
public class Map implements Serializable {
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
    public Map(int _cols, int _rows) {
        rowCount = _rows;
        colCount = _cols;
        // creat the array of location objects
        locations = new Location[_cols][_rows];
    }
    
    
// getters
    // The getRowCount method
    // Purpose: returns the location object at the given row and column
    // Parameters:
    // Returns: 
    public int getRowCount()
    {
        return rowCount;
    }

    // The getColCount method
    // Purpose: 
    // Parameters: 
    // Returns: 
    public int getColCount() {
        return colCount;
    }

    // The getLocation method
    // Purpose: returns the location object at the given row and column
    // Parameters: a row and column
    // Returns: a Location object
    public Location getLocation(int col, int row) {
        return locations[col][row];
    }
    
    
// setter
    // The setLocation method
    // Purpose: stores a location object at the  row and column
    // Parameters: a row and column, and a reference to a location object
    // Returns: void
    public void setLocation(int col, int row, Location _location)
    {
        locations[col][row] = _location;
    } 
    
        /**
     * setLocation method
     * Purpose: stores location objects at the rows and columns
     */
    public void setLocation(int col, int row, int col2, int row2, Location _location){    
        for (int i = col;i<=col2; i++) {
            for (int j = row;j<=row2; j++) {
                locations[i][j] = _location;
            }
        }
    }
}
