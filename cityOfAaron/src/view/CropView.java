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

    /**
     * The runCropView method() 
     * Purpose: runs the methods to manage the crops
     * Game Parameters: none 
     * Returns: none
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

        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        System.out.print("\nHow many acres of land do you wish to buy? ");

        //  Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();

        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.buyLand(price, toBuy, cropData);

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

        // Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        System.out.print("\nHow many acres of land do you wish to sell? ");

        //  Get the user’s input and save it.
        int toSell;
        toSell = keyboard.nextInt();

        // Call the sellLand( ) method in the control layer to sell the land
        CropControl.sellLand(price, toSell, cropData);

        // output how much land we now own
        System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
    }
    
    // The feedPeopleView method
    // Purpose: interface with the user input for feeding the people
    // Parameters: none 
    // Returns: none
    // Author: Ching Lo
    public static void feedPeopleView(){
        // Prompt the user to enter the number of bushels to feed people
        System.out.print("How many bushels of grain do you want to give to the people? ");
        
        // Get the user’s input and save it.
        int wheatForFood;
        wheatForFood = keyboard.nextInt ();

        // Call the feedPeople( ) method in the control layer 
        CropControl.feedPeople(wheatForFood, cropData);

        // output how much bushels of wheat we have left
        System.out.format("You now have %d bushels of wheat. ", cropData.getWheatInStore());
        
    }
    
 /**
     * plantCropsView method
     * Purpose: Display acres owned and wheat in store and then prompt user for amount
     * they wish to use to plant crops
     */
    public static void plantCropsView() {
        //display current land, wheat, and population
        System.out.format("\n\nHow much land needed for crops?\nAcres of land owned: %d\n", cropData.getAcresOwned());
        System.out.format("Bushels of Wheat in storehouse: %d\n", cropData.getWheatInStore());
        System.out.format("Current city population: %d\n", cropData.getPopulation());
        //display conditions needed to care for crops and prompt user for input
        System.out.println("\n1 bushel of wheat can plant 2 acres, " +
                           "while 1 person can take care of 10 acres planted.\n" +
                           "How many acres of land do you wish to plant? ");
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
int howManyPeopleStarved = cropData.getHarvest();
int howManyPeopleComeToTheCity = cropData.getNewPeople();
int theCurretntPopulation = cropData.getPopulation();
int theNumberOfAcresOfLandOwned = cropData.getAcresOwned();
int theNumberOfBushelsPerAcreHarvested = cropData.getWheatForFood();
int theTotalNumberOfBushelsOfWheatHarvested = cropData.getAcresPlanned();
int theNumberOfBushelsOfWheatInStore = cropData.getWheatInStore();
    

System.out.format("Year:" + theYearNumber + " %n");
System.out.format("People starved: " + howManyPeopleStarved + " %n");
System.out.format("New People: " + howManyPeopleComeToTheCity + " %n");
System.out.format("Population: " + theCurretntPopulation + " %n");
System.out.format("Land owned by the city: " + theNumberOfAcresOfLandOwned + " %n");
System.out.format("Bushels per acre harvested: " + theNumberOfBushelsPerAcreHarvested + " %n");
System.out.format("Bushels of wheat harvested: " + theTotalNumberOfBushelsOfWheatHarvested + " %n");
System.out.format("Bushels of wheat in store: " + theNumberOfBushelsOfWheatInStore + " %n");
         }
    
    
}
