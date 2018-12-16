/*
 * CIT-260
 * Fall 2018
 * Team members:  Ching Lo, Kachia Vang, Christian Juarez
 * The CropControl class - part of the control layer
 * class contains all of the calculation methods for managing cropData
 */
package control;

import cityofaaron.CityOfAaron;
import java.util.Random;
import model.CropData;
import exceptions.*;
import java.util.ArrayList;
import model.Game;
import model.ListItem;


public class CropControl {

// Generate a random number for the price of an acre of land. 
// Make this value between 17 and 27 bushels per acre.
    // constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;

    // random number generator
    private static Random random = new Random();

    // calcLandCost() method
    // Purpose: Calculate a random land cost between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land cost
    public static int calcLandCost() {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }

// sellLand method
// Purpose: Sell land  - subtracts from the acres owned
// Parameters: the price of land, the number of acres to sell, and
//     a reference to a CropData object 
// Pre-conditions: acresToSell >= 0 and acresToSell <= acresOwned
// Returns: the number of acres owned after the sale
    // method signature
    public static int sellLand(int landPrice, int acresToSell, CropData cropData) throws CropException {
        //if acresToSell < 0, Throw exception that entry was too low
        if (acresToSell < 0) {
            throw new CropException("A negative number was entered.");
        }

        //if acresToSell > acresOwned, Throw exception that entry was too low
        int owned = cropData.getAcresOwned();
        if (acresToSell > owned) {
            throw new CropException("Quantity greater than acres owned was entered.");
        }

        //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);

        //wheatInStore = wheatInStore + (acresToBuy x landPrice)
        int wheat = cropData.getWheatInStore();
        wheat += (acresToSell * landPrice);
        cropData.setWheatInStore(wheat);

        //return acresOwned
        return owned;
    }

// The buyLand method
// Purpose: To buy land
// Parameters: the price of the land, the number of acres to buy,
//     	and a reference to a CropData object
// Returns: the total acres owned after the purchase
// Pre-conditions: acres to buy must be positive
//     	and <= the number of wheat owned
// Updated 11-28-18 to Throw Exceptions
    // method signature
    public static void buyLand(int landPrice, int acresToBuy, CropData cropData) throws CropException {
        // if acresToBuy < 0, throw exception
        if (acresToBuy < 0) {
            throw new CropException("A negative value was entered.");
        }
        // if acresToBuy > wheatInStore,  throw exception
        int owned = cropData.getWheatInStore();
        if ((acresToBuy * landPrice) > cropData.getWheatInStore()) {
            throw new CropException("There is insufficient wheat to buy this much land.");
        }
        // acresOwned = acresOwned + acresToBuy
        owned += acresToBuy;
        cropData.setAcresOwned(owned);
        // wheatInStore = wheatInStore - (acresToBuy x landPrice)
        int stored = cropData.getWheatInStore();
        stored -= (acresToBuy * landPrice);
        cropData.setWheatInStore(stored);
        // remove return, and update CropData object with acres owned after buying
        cropData.setAcresOwned(cropData.getAcresOwned() + acresToBuy);
    }

// author Christian Juarez
// the setOffering method 
// Purpose: To allocate the offering
// Parameters: a reference to a payOffering object
//     	and a reference to a CropData object
// Returns: the percentage of offering
// The percentage of the harvest the player wants to set as an
// offering must be grater or equal to 0%
// The percentage of the harvest the player wants to set as an 
//    offering must be lower or equal to 100%
    // method signature
    public static int setOffering(int percentageOffering, CropData cropData) {
        // if percentageOffering < 0, return -1
        if (percentageOffering < 0) {
            return -1;
        }
        // if percentageOffering > 100 return -1
        if (percentageOffering > 100) {
            return -1;
        }
        // updates SetOffering variable
        cropData.setSetOffering(percentageOffering);
        // return the percentage of offering
        return percentageOffering;
    }

// author Ching Lo
// the feedPeople method 
// Purpose: To set aside bushels of wheat to feed people
// @param the number of bushels of wheat to set aside
// @param a reference to a CropData object
// @return the number of wheat for people/food 
// @return the number of wheat in store
// Pre-conditions: wheat to set aside for food must be positive
//    and <= the number of wheat in store
// Updated 11-30-18 to Throw Exceptions
    // method signature
    public static void feedPeople(int wheatForFood, CropData cropData) throws CropException {
        //if wheatForFood < 0, throw exception
        if (wheatForFood < 0) {
            throw new CropException("The number entered must be greater than 0.");
        }
        // if wheatForFood > wheatInStore,  throw exception
        int wheatInStore = cropData.getWheatInStore();
        if (wheatForFood > wheatInStore) {
            throw new CropException("There is insufficient wheat in store to feed people.");
        }
        
        // wheatInStore = wheatInStore - wheatForPeople
        // updates wheatInStore variable
        wheatInStore -= wheatForFood;
        cropData.setWheatInStore(wheatInStore);
        
        // wheat for people same as wheat for food
        // wheatForFood = newly set aside wheat for people + wheat already stored for people
        // update cropData.wheatForFood variable
        wheatForFood += cropData.getWheatForFood();
        // remove "return wheatForFood" and update CropData object
        cropData.setWheatForFood(wheatForFood);
    }

// author Kachia Vang
// the plantCrops method
// Purpose: To determine how many acres and wheat is owned and used to plant crops
// @param acresToPlant is number of acres to be used for planting
// @param a referene to a CropData object
// @return the number of acres planted and amount of wheat left in storage
// Pre-conditions: acres being planed must be positive and <= acresOwned,
// population must be >= (acres planted/10), and wheat in store must be >=
// (acres planted/2)
//
    //method signature
 public static void plantCrops(int acresToPlant, CropData _cropData) throws CropException {
        int owned = _cropData.getAcresOwned();
        int pop = _cropData.getPopulation();
        int wheat = _cropData.getWheatInStore();
        int planted = _cropData.getAcresPlanned();
        //wheat needed = acresToPlant/2
        int wheatNeeded = acresToPlant / 2;
        //pop needed = acresToPlant/10
        int popNeeded = acresToPlant / 10;
        //check preconditions and throw exception if they are not ok
        if(acresToPlant < 0) {
            //input was negative
            throw new CropException("Cannot plant a negative value");
        }
        if(acresToPlant > owned) {
            //input was more than acres owned
            throw new CropException("The city does not own this much land");
        }
        if(pop < popNeeded) {
            //not enough population to care for crops
            throw new CropException("Not enough people to care for the crops");
        }
        if(wheat < wheatNeeded) {
            //not enough wheat to plant acres input
            throw new CropException("There is insufficient wheat to plant this many acres");
        }
        //subtract wheat needed from wheat in store
        wheat -= wheatNeeded;
        _cropData.setWheatInStore(wheat);
        //set acresPlanted
        _cropData.setAcresPlanted(acresToPlant);
    }
    
 
 
 /*
     * SurplusWheatForTools method 
     * Purpose: To use surplus crops for purchase of tools
     */
     public static void useSurplusWheatForTools(int toolsToPurchase, CropData cropData) throws CropException {
        // 1 tool per 2 bushel of wheat
        int _toolsToPurchase = toolsToPurchase;
        if (toolsToPurchase < 0) {
            throw new CropException ("Please pick a valid amount to use");        }

        int wheatInStore = cropData.getWheatInStore();
        if (wheatInStore < toolsToPurchase * 2) {
            throw new CropException ("You do not have enough wheat in store. You may only use surplus");
        }

        //get remaining wheat after spending for tools
        wheatInStore -= toolsToPurchase * 2;
        
        Game theGame = CityOfAaron.getTheGame();
        ArrayList<ListItem> tools = theGame.getTools();
        
         
        // The total amount of tools
        while (_toolsToPurchase > 0) {
            for (ListItem tool : tools) {	
                if (_toolsToPurchase > 0){
                     _toolsToPurchase--;
                     int toolCount = tool.getNumber();
                 tool.setNumber(toolCount + 1);
                 theGame.setToolCount(theGame.getToolCount() + 1);
                 System.out.println("hit");
                         
                 }
             }
        }
        System.out.println("toolsCount" + theGame.getToolCount());
        theGame.setToolMultiplier(Math.round(theGame.getToolCount() / (theGame.getToolCount() - 1)  * 1.5));
        // Refreshing cropData with the new values
        cropData.setWheatInStore(wheatInStore);
    }    

}
