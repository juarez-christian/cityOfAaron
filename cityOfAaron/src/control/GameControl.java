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
import java.util.ArrayList;

public class GameControl {
    // size of the Locations array
    private static final int MAX_ROW = 5; // these are used for the map object
    private static final int MAX_COL = 5;
    
    // Create a new Game object.
    private static Game game = new Game();

    // createNewGame method
    public static void createNewGame(String _name) {

        // Create a new Player object
        Player thePlayer = new Player();
        // Store the name of the Player in the Player object
        thePlayer.setName(_name);
        // Store a reference to the Player object in the Game object
        game.setthePlayer(thePlayer);
        
        // Save a reference to the Game object
        //CityOfAaron.setGame(game);
        
        // call to method
        createCropDataObject();
        
        // call to methods
        createMap();
        createAnimalList();
        createProvisionsList();
    }
        
        
    /*
    * createCropDataObject method
    * Purpose: to create the cropData object and 
    *  set initial values for cropData
    * Parameters: none
    * Return: none
    */
    public static void createCropDataObject() {
        // Create a CropData object
        CropData cropData = new CropData();
        
        // Initialize the data values in the CropData object
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setSetOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        //cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000);

        // Save a reference to the CropData object in the Game object
        game.setCropData(cropData);

    }

    /*
    * createMap method
    * Purpose: to create the map objects and 
    *  set the locations of the objects in the map
    * Parameters: None
    * Return: None
    */
    public static void createMap () {
        // Create the Map object, it is a 5 x 5
        // Refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        // Create a new Location object
        Location location = new Location();
        
        // RIVER
        // Create a string that will go in the Location objects
        // that contain the river
        String river = "\nYou are on the River. The river is the source"+
                       "\nof life for our City. The river marks the eastern "+
                       "\nboundary of the City. It is wilderness to the East.";
    
        // Use setters in the Location class to set the description and symbol
        location.setDescription(river);
        location.setSymbol("~~~");
        
        // Set this location object in each cell of the array in column 4
        for(int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 4, location);
        }
        
        // FARMLAND
        // Create a string for farmland location
        String farmland = "\nYou are on the fertile banks of the River."+
                          "\nIn the Spring, this low farmland floods and it is covered " +
                          "\nwith new rich soil. Wheat is planted as far as you can see.";
        
        // Set a farmland location with a hint
        location = new Location();
        location.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        location.setSymbol("$$$");
        // Set this object in row 0, column 2
        theMap.setLocation(0, 2, location);
        
        // STOREHOUSE
        // Create a sring for storehouse location
        String storehouse = "\nYou have found the City's treasure."+
                            "\nThis is the City's storehouse.";
        
        // Set  location for the storehouse
        location = new Location();
        location.setDescription(storehouse + "\nLet's be frugal and self-reliant.");
        location.setSymbol("<><>");
        // Set this object in row 3 in column 1 
        theMap.setLocation(3, 1, location);
        
        // GARDEN
        // Create a string for the garden
        String garden = "\nOne must take the time to enjoy the beauty "+
                        "\nat the Garden of Life.";
        // Set location for the garden
        location = new Location();
        location.setDescription(garden + "\nTake time to ponder on the beauty of the Earth.");
        location.setSymbol("****");
        // Set this object in rows 2, 3, 4 and column 0
        for(int i=2; i<5; i++)
        {
            theMap.setLocation(i, 0, location);
        }
        
        // VILLAGE
        // Create a string for the Village
        String village = "\nOur families welcomes yours. "+
                         "\nThis is the Village.";
        // Set location for the village
        location = new Location();
        location.setDescription(village + "\nHome Sweet Home");
        location.setSymbol("^^^^^");
        // Set this object in rows 0, 1 and column 0
        for(int i=0; i<2; i++)
        {
            theMap.setLocation(i, 0, location);
        }
        
        // TEMPLE
        // Create a string for the garden
        String temple = "\nYou are entering sacred grounds. "+
                        "\nThe temple is heaven on earth.";
        // Set location for the garden
        location = new Location();
        location.setDescription(temple + "\nThank Heavenly Father often for all your blessings.");
        location.setSymbol("^***^");
        // Set this object in row 4 and column 1
        theMap.setLocation(4, 1, location);
        
        
        // ICE CREAM SHOP
        // Create a string for the garden
        String icecream = "\nThe people loves to eat ice cream!";
        // Set location for the garden
        location = new Location();
        location.setDescription(icecream + "\nVoted best ice cream in the world!");
        location.setSymbol("@@@");
        // Set this object in row 1 and column 1
        theMap.setLocation(1, 1, location);
  
        
        // LAMANITES BORDER
        // Create a string for the desert location
        String lamanites = "\nYou have reached the border of the Lamanites. "+
                        "\nThough they hate us, let us show them kindness.";
        // Set location for the lamanites land
        location = new Location();
        location.setDescription(lamanites + "\nEnter at your own risk.");
        location.setSymbol("!!!");
        // Set this object in each cell of the array in row 5
        for(int i = 0; i < MAX_COL; i++) {
        //  theMap.setLocation(5, i, location);
            theMap.setLocation(4, i, location);
        }
        
        // Save the Map object in the game
        game.settheMap(theMap);
        
    }
    
    /*****************************
     * LISTS
     */
    
    /*
     * List of Animals
     * Author: Ching Lo
     *
    */
    public static void createAnimalList() {
        ArrayList<ListItem>animals = new ArrayList<>();
        
        animals.add(new ListItem("chickens", 30));
        animals.add(new ListItem("pigs", 20));
        animals.add(new ListItem("cows", 15));
        animals.add(new ListItem("horses", 25));
        animals.add(new ListItem("sheep", 13));
        animals.add(new ListItem("goats", 16));
        animals.add(new ListItem("ducks", 7));
        
        game.setAnimals(animals);
    }
    
    
    /*
     * List of Tools
     * Author: Kachia Vang
    */
    
    
    /*
     * List of Provisions
     * Author: Christian Juarez
    */
                  
    public static void createProvisionsList() {
        ArrayList<ListItem>provisions = new ArrayList<>();
           
        provisions.add(new ListItem("provision 1", 134));
        provisions.add(new ListItem("provision 2", 13));
        provisions.add(new ListItem("provision 3", 1));
        provisions.add(new ListItem("provision 4", 11));
        provisions.add(new ListItem("provision 5", 5));
        provisions.add(new ListItem("provision 6", 35));
        provisions.add(new ListItem("provision 7", 15));
        
        game.setProvisions(provisions);
    }
    
}

