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

// The buyLand method
// Purpose: To buy land
// Parameters: the price of the land, the number of acres to buy,
//     	and a reference to a CropData object
// Returns: the total acres owned after the purchase
// Pre-conditions: acres to buy must be positive
//     	and <= the number of wheat owned
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

  






// sellLand method
    // Purpose: Sell land  - subtracts from the acres owned
    // Parameters: the price of land, the number of acres to sell, and
    //     a reference to a CropData object 
    // Pre-conditions: acresToSell >= 0 and acresToSell <= acresOwned
    // Returns: the number of acres owned after the sale
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




    
}




