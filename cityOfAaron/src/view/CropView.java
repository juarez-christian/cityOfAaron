/*
 * CropView.java
 * CIT-260
 * Fall 2018
 * Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */
package view;

import model.*;
import control.*;
import exceptions.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import java.io.Serializable;

public class CropView extends MenuView implements Serializable {

    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);

    // Get references to the Game object and the CropData object
    private static Game game = CityOfAaron.getTheGame();
    private static CropData cropData = game.getcropData();
    
       /**
*	The MainMenuView constructor
*	Purpose: Initialize the menu data
*	Parameters: none
*	Returns: none
*/
// ===================================
public CropView()
{
    super("\n" +
        "**********************************\n" +
        "* CITY OF AARON: Crop Control  *\n" +
        "**********************************\n\n" +
        "	1 - Buy Land\n" +
        "       2 - Sell Land\n" +
        "	3 - Feed People\n" + 
        "       4 - Plant Crops\n" + 
        "       5 - Display Crop Report\n" +
        "       6 - Return\n",
    9);
}
 /**
    *   The doAction method
    *	Purpose: performs the selected action
    *	Parameters: none
    *	Returns: none
     * @param option
    */
    // ===================================
    @Override public void doAction(int option)
    {
        switch (option)
        {
            case 1: // View goals of game
                buyLandView();
                break;
            case 2: // View Whereis Viry of Aaron
                sellLandView();
                break;
            case 3: // View Map Help
                feedPeopleView();;
                break;
            case 4: // View move help
                plantCropsView();
                break;
            case 5: // View lists help
                displayCropsReportView(); 
                break;            
            case 6: //exit back main menu
            
 
        }
    }  

    /**
     * The runCropView method() Purpose: runs the methods to manage the crops
     * Game Parameters: none Returns: none
     * =================================================================
     */
    public static void runCropView() {
        // call the buyLandView( ) method
        buyLandView();

        // call the sellLandView( ) method
        sellLandView();

        // call the feedPeopleView( ) method
        feedPeopleView();

        // call the feedPeopleView( ) method
        plantCropsView();

        // call the feedPeopleView( ) method
        displayCropsReportView();
    }

    // The buyLandView method
    // Purpose: interface with the user input for buying
    // Parameters: none 
    // Returns: none
    public static void buyLandView() {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();
        
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        
        //  Get the user’s input and save it.
        int toBuy;
        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
            // Prompt the user to enter the number of acres to buy
            System.out.print("\nHow many acres of land do you wish to buy? ");
            toBuy = keyboard.nextInt();

            // add the try block call that could throw an exception
            try {
                // Call the buyLand( ) method in the control layer to buy the land
                CropControl.buyLand(price, toBuy, cropData);
            }
            // catch block to be executed when there is an exception 
            catch(CropException e){
                System.out.println("I am sorry, but I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }
        while(paramsNotOkay);
        
        // output how much land we now own
        System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
    }  

    // The sellLandView method
    // Purpose: interface with the user input for selling
    // Parameters: none 
    // Returns: none
    // Author: Ching Lo
    public static void sellLandView() {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();
        boolean paramsNotOkay;
        do {
            // Set variable to check for exceptions
            paramsNotOkay = false;
            // Variable for getting user input
        int toSell;
       
        // Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        System.out.print("\nHow many acres of land do you want to sell? ");
        toSell = keyboard.nextInt();

        
            try {
                //call sellLand() method in the control layer to sell the land
                CropControl.sellLand(price, toSell, cropData);

            } 
            //add catch block to be executed when there is an exception
            catch(CropException e){
                // Print exception report to user
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay
                        = true;

            }
        } while (paramsNotOkay);
        //output updated land owned and wheat in storehouse
        System.out.format("\nCurrent acres owned: %d", cropData.getAcresOwned());
        System.out.format("\nCurrent wheat in storehoues: %d\n", cropData.getWheatInStore());

    }


    // Author: Ching Lo
    // The feedPeopleView method
    // Purpose: interface with the user input for feeding the people
    // Parameters: none 
    // Returns: none
    public static void feedPeopleView() {
        // Prompt the user to enter the number of bushels to feed people
        System.out.print("How many bushels of grain do you want to give to feed the people? ");

        // Get the user’s input and save it.
        int wheatForFood;
        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
            wheatForFood = keyboard.nextInt();
            // add the try block call that could throw an exception
            try {
                // Call the feedPeople( ) method in the control layer
                CropControl.feedPeople(wheatForFood, cropData);
            }
            // add catch block to be executred when there is an exception
            catch(CropException e){
                System.out.println("I'm sorry, but you cannot feed people with this number.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }
        while(paramsNotOkay);
        
        // output how much bushels of wheat we have left
        System.out.format("You now have %d bushels of wheat left after feeding people. ", cropData.getWheatInStore());
    }

    // plantCropsView method
    // Purpose: Display acres owned and wheat in store 
    //   and then prompt user for amount they wish to use to plant crops
    // Parameters: none
    // Returns: none
    // Author: Kachia Vang
    public static void plantCropsView() {
        //display current land, wheat, and population
        System.out.format("\n\nHow much land needed for crops?\nAcres of land owned: %d\n", cropData.getAcresOwned());
        System.out.format("Bushels of Wheat in storehouse: %d\n", cropData.getWheatInStore());
        System.out.format("Current city population: %d\n", cropData.getPopulation());
        //display conditions needed to care for crops and prompt user for input
        System.out.println("\n1 bushel of wheat can plant 2 acres, "
                + "while 1 person can take care of 10 acres planted.\n"
                + "How many acres of land do you wish to plant? ");
        //get input and save
        int toPlant;
        toPlant = keyboard.nextInt();
        //call plantCrops() method to plant crops
        CropControl.plantCrops(toPlant, cropData);
        //output acres planted for future harvest
        System.out.format("\nYou have planted %d acres of land for next year's harvest.", cropData.getAcresPlanned());
        System.out.format("\nCurrent wheat in storehoues: %d\n", cropData.getWheatInStore());
    }

    // The displayCropsReportView method
    // Purpose: interface with the user input for display a report of the crops
    // Parameters: none 
    // Returns: none
    // Author: Christian Juarez
    public static void displayCropsReportView() {

        int theYearNumber = cropData.getYear();
        int howManyPeopleStarved = cropData.getNumStarved();
        int howManyPeopleComeToTheCity = cropData.getNewPeople();
        int theCurrentPopulation = cropData.getPopulation();
        int theNumberOfAcresOfLandOwned = cropData.getAcresOwned();
        int theNumberOfBushelsPerAcreHarvested = cropData.getHarvest();
        int theTotalNumberOfBushelsOfWheatHarvested = cropData.getAcresPlanned();
        int theNumberOfBushelsOfWheatInStore = cropData.getWheatInStore();

        System.out.format("Year:" + theYearNumber + " %n");
        System.out.format("People starved: " + howManyPeopleStarved + " %n");
        System.out.format("New People: " + howManyPeopleComeToTheCity + " %n");
        System.out.format("Population: " + theCurrentPopulation + " %n");
        System.out.format("Land owned by the city: " + theNumberOfAcresOfLandOwned + " %n");
        System.out.format("Bushels per acre harvested: " + theNumberOfBushelsPerAcreHarvested + " %n");
        System.out.format("Bushels of wheat harvested: " + theTotalNumberOfBushelsOfWheatHarvested + " %n");
        System.out.format("Bushels of wheat in store: " + theNumberOfBushelsOfWheatInStore + " %n");
    }

}
