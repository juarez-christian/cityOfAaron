/*
 * CIT-260
 * Fall 2018
 * Team members:  Ching Lo, Kachia Vang, Christian Juarez
 * The CropControl class - part of the control layer
 * class contains all of the calculation methods for managing cropData
 */

package control;
//import java.util.Random;
import model.CropData;

/**
 *
 * @author _Chris_
 */

public class CropControl {
 
/* Generate a random number for the price of an acre of land. 
    Make this value between 17 and 27 bushels per acre.*/ 
/*   
// constants
   private static final int LAND_BASE = 17;
   private static final int LAND_RANGE = 10;
        
// random number generator
   private Random random = new Random();
     
// calcLandCost() method
// Purpose: Calculate a random land cost between 17 and 26 bushels/acre
// Parameters: none
// Returns: the land cost
    
    public static int calcLandCost()
    {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;  
        return landPrice;            
    }
  
 */

// sellLand method
// Purpose: Sell land  - subtracts from the acres owned
// Parameters: the price of land, the number of acres to sell, and
//     a reference to a CropData object 
// Pre-conditions: acresToSell >= 0 and acresToSell <= acresOwned
// Returns: the number of acres owned after the sale
    
    // method signature
    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    {
        //if acresToSell < 0, return -1
          if(acresToSell < 0)
              return -1;
        
        //if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if(acresToSell > owned)
             return -1;
        
        //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);
        
        //wheatInStore = wheatInStore + (acresToBuy x landPrice)
        int wheat = cropData.getWheatInStore();
        wheat+= (acresToSell * landPrice);
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
    
    // method signature
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData)
    {
        // if acresToBuy < 0, return -1
        if (acresToBuy < 0)
        return -1;
        // if acresToBuy > wheatInStore,  return -1
        int owned = cropData.getWheatInStore();
        if ((acresToBuy * landPrice) > cropData.getWheatInStore())
        return -1;
        // acresOwned = acresOwned + acresToBuy
        owned += acresToBuy;
        cropData.setAcresOwned(owned);
        // wheatInStore = wheatInStore - (acresToBuy x landPrice)
        int stored = cropData.getWheatInStore(); 
        stored -= (acresToBuy * landPrice);    
        cropData.setWheatInStore(stored);
        // return acresOwned
        return owned;
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
    public static int setOffering(int payOffering, CropData cropData)
    {
        // if payoffering < 0, return -1
        if (payOffering < 0)
        return -1;
        // if payoffering > 100 return -1
        if (payOffering > 100)
        return -1;
        // return the percentage of offering
        return payOffering;
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

    // method signature
    public static int feedPeople(int wheatForFood, CropData cropData)
    { 
        //if wheatForFood < 0, return -1
        if(wheatForFood < 0)
            return -1;
        // if wheatForFood > wheatInStore,  return -1
        int wheatInStore = cropData.getWheatInStore();
        if(wheatForFood > wheatInStore)
            return -1;
        
        // wheatInStore = wheatInStore - wheatForPeople
        // updates wheatInStore variable
        wheatInStore -= wheatForFood;
        cropData.setWheatInStore(wheatInStore);
        
        // wheat for people same as wheat for food
        // wheatForFood = newly set aside wheat for people + wheat already stored for people
        // update cropData.wheatForFood variable
        wheatForFood += cropData.getWheatForFood();
        cropData.setWheatForFood(wheatForFood);
        
        return wheatForFood;
    }
    
}




