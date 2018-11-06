/*
 * CropView.java
 * CIT-260
 * Fall 2018
 * Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */


package view;
import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;


public class CropView {
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);   

    // Get references to the Game object and the CropData object
    static private Game game = CityOfAaron.getTheGame();
    static private CropData cropData = game.getcropData();
    
    /** The runCropView method()
    * Purpose: runs the methods to manage the crops game
    * Parameters: none
    * Returns: none
    * =================================================================
    */
    public static void runCropView()
    {
        // call the buyLandView( ) method
        buyLandView( );

        /** add calls to the other crop view methods
        * as they are written:
        * sellLandView()
        * feedPeopleView()
        * plantCropsView()
        * displayCropsReportView()
        */
    }

    /** The buyLandView method
    * Purpose: interface with the user input for buying land
    * Parameters: none
    * Returns: none
    * ==================================================================
    */
    public static void buyLandView()
    {
     // Get the cost of land for this round.
     int price = CropControl.calcLandCost();

    // Prompt the user to enter the number of acres to buy
    System.out.format("Land is selling for %d bushels per acre.%n",price);
    System.out.print("\nHow many acres of land do you wish to buy? "); 

    //  Get the user’s input and save it.
    int toBuy;
    toBuy = keyboard.nextInt();

    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.buyLand(price, toBuy, cropData);
    
    // output how much land we now own
    System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
    }
   
    
}
