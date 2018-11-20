/*
// Source code for the GameControl class
// The GameControl class is a member of the controllayer
// Methods in the  GameControl class manage Game objects
// Team members:  Ching Lo, Kachia Vang, Christian Juarez
// Date Last modified: october 2018
// ==============================================================

 */
package control;

import model.*;
import cityofaaron.*;

/**
 *
 * @author _Chris_
 */
public class GameControl {
     // size of the Locations array
        private static final int MAX_ROW = 5; // these are used for the map object
        private static final int MAX_COL = 5;

    // createNewGame method
    public static void createNewGame(String _name) {
        // Create a new Game object.
        Game game = new Game();
        // Create a new Player object
        Player thePlayer = new Player();
        thePlayer.setName(_name);
        // Store the name of the player in the Player object
        game.setthePlayer(thePlayer);
        // Store a reference to the Player object in the Game object
            // method prologue ….
        public static void createCropDataObject()
        {
        // Create a CropData object
        CropData cropData = new CropData();
        // Initialize the data values in the CropData object
        // Save a reference to the CropData object in the Game object
/*
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000);
*/
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000); 
        
        game.setCropData(cropData);
        
        }

        // Save a reference to the Game object in the static variable
        // declared in the CityOfAaron class.
        CityOfAaron.setTheGame(game);
        
        
       
    


    }

}
