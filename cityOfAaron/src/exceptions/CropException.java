/*
 * CIT-260
 * Fall 2018
 * Team members:  Ching Lo, Kachia Vang, Christian Juarez
 * The CropException class for the CropControl Class
 * class contains all of the exceptions when there is a runtime error
 */
package exceptions;

public class CropException extends Exception {
    // Default constructor
    // Purpose: Initializes data members to default values
    // Parameters: none
    // Returns: none
    public CropException() { }


    // Parameterized constructor
    // Purpose: Initializes data members to value passed as a parameter
    // Parameters: A string containing the error message
    // Returns: none
    public CropException(String string)
    {
        super(string);
    } 

    
}
