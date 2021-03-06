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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.*;

public class GameControl {
    // size of the Locations array
    private static final int MAX_ROW = 6; // these are used for the map object
    private static final int MAX_COL = 6;
    
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
        CityOfAaron.setTheGame(game);
        
        // call to method
        createCropDataObject();
        
        // call to methods
        createMap();
        createAnimalList();
        createToolList();
        createProvisionsList();
        createTeamList();
        game.setEndOfGame(false);
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
        // Set this object in rows 1, 2, 3, 4 and column 2
        for(int i=1; i<5; i++){
            theMap.setLocation(i, 2, location);
        }
        // Set this object in rows 0, 1, 2, 3, 4 and column 3
        for(int i=0; i<5; i++){
            theMap.setLocation(i, 3, location);
        }
        
        // STOREHOUSE
        // Create a sring for storehouse location
        String storehouse = "\nYou have found the City's treasure."+
                            "\nThis is the City's storehouse.";
        
        // Set  location for the storehouse
        location = new Location();
        location.setDescription(storehouse + "\nLet's be frugal and self-reliant.");
        location.setSymbol("<><>");
        // Set this object in row 2 and 3 in column 1 
        theMap.setLocation(2, 1, location);
        theMap.setLocation(3, 1, location);
        
        // GARDEN
        // Create a string for the garden
        String garden = "\nOne must take the time to enjoy the beauty "+
                        "\nat the Garden of Life.";
        // Set location for the garden
        location = new Location();
        location.setDescription(garden + "\nTake time to ponder on the beauty of the Earth.");
        location.setSymbol("***");
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
        location.setSymbol("^^^");
        // Set this object in rows 0, 1 and column 0, 1
        for(int i=0; i<2; i++)
        {
            theMap.setLocation(i, 0, location);
        }
        
        // TEMPLE
        // Create a string for the temple
        String temple = "\nYou are entering sacred grounds. "+
                        "\nThe temple is heaven on earth.";
        // Set location for the garden
        location = new Location();
        location.setDescription(temple + "\nThank Heavenly Father often for all your blessings.");
        location.setSymbol("^*^");
        // Set this object in row 4 and column 1
        theMap.setLocation(4, 1, location);
        
        // ICE CREAM SHOP
        // Create a string for the ice cream shop
        String icecream = "\nThe people loves to eat ice cream!";
        // Set location for the garden
        location = new Location();
        location.setDescription(icecream + "\nVoted best ice cream in the world!");
        location.setSymbol("@@@");
        // Set this object in row 0 and column 2
        theMap.setLocation(0, 2, location);
        
        // Wilderness land
        // Create a string for the wilderness land
        String wilderness = "\nYou are entering unknown territotry. Return home for your safety.";
        // Set location for the wilderness land
        location = new Location();
        location.setDescription(wilderness + "\nYou must return to the village now.");
        location.setSymbol("???"); 
        // Set this location object in each cell of the array in column 5
        for(int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 5, location);
        }       
  
        // LAMANITES BORDER
        // Create a string for the Lamanite Border
        String lamanites = "\nYou have reached the border of the Lamanites. "+
                        "\nThough they hate us, let us show them kindness.";
        // Set location for the lamanites land
        location = new Location();
        location.setDescription(lamanites + "\nEnter at your own risk.");
        location.setSymbol("!!!");
        // Set this object in each cell of the array in row 5, columns 1-4
        for(int i = 0; i < 4; i++) {
        //  theMap.setLocation(5, i, location);
            theMap.setLocation(5, i, location);
        }
        
        // Save the Map object in the game
        game.settheMap(theMap);
        
    }
    
    /*****************************
     * LISTS
    ******************************/
    
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
        
        game.setAnimals(animals);
    }
    
    
    /*
     * List of Tools
     * Author: Kachia Vang
    */
    public static void createToolList() {
        ArrayList<ListItem>tools = new ArrayList<>();
        
        tools.add(new ListItem("nails", 500));
        tools.add(new ListItem("hammer", 10));
        tools.add(new ListItem("shovel", 35));
        tools.add(new ListItem("axe", 25));
        tools.add(new ListItem("plows", 33));
        
        game.setTools(tools);
    }
    
    
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
    
    /*
     * List of Team Members
     * Author: Ching Lo
     *
     */
    public static void createTeamList() {
        ArrayList<ListItem>team = new ArrayList<>();
        
        team.add(new ListItem("Ching", 1));
        team.add(new ListItem("Christian", 1));
        team.add(new ListItem("Kachia", 1));   
        
        game.setTeam(team);
    }
    
    // the getSavedGame method
    // Purpose: load a saved game from disk
    // Parameters: the file path
    // Returns: none
    // Side Effect: the game reference in the driver is updated
    public static void getSavedGame(String filePath) 
    {
        Game theGame;
        theGame = null;

        try (FileInputStream fips = new FileInputStream(filePath)) 
        {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            theGame = (Game) input.readObject();
            CityOfAaron.setTheGame(theGame);
        } catch (Exception e) {
            System.out.println("\nThere was an error reading the saved game file.");
        }
    }
    
    // the saveGame method
    // Purpose: save a game to file
    // Parameters: the file path
    // Returns: none
    public static void saveGame(String filePath)
    {
        Game theGame;
        theGame = null;

        try (FileOutputStream fops = new FileOutputStream(filePath))
        {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            //write game object to file
            output.writeObject(theGame);
            
            //game saved message
            System.out.println("Your game was saved.");
        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error saving your game.");
        }
    }

      /*****************************
     * PRINT WRITER METHODS
    ******************************/
    
    // the printWriter method for Animal List
    // Purpose: to save a list to disk
    // Parameters: the file path, the object, the animal list
    // Returns: none
    // author: Ching
    
    public static void printAnimals (String _fileName) {
       
        //Create Print Writer object and write to file
        try (PrintWriter printWriter = new PrintWriter(new File(_fileName))) {
            
            // get a reference to the ArrayList
            ArrayList<ListItem> animals = game.getAnimals();

            // output headerfor the report
            printWriter.println ("Animal List in Inventory:\n");
   
            // Get the data from the ArrayList and write it to file
            for (ListItem animal: animals) {
                printWriter.println(animal.getName() + "\t" + animal.getNumber());
            }
            // Success message
            System.out.println("List of animals successfully written to " 
                    + _fileName + ".txt");
             
        } catch (Exception e) {
            // Output error message
            System.out.println("Error: Sorry, Animal List was not saved to file." + e.getMessage());
        }
    }
    
    /**
     * printTools method
     * Purpose: print to file the tools array
     * Author: Kachia
     */
    public static void printTools (String _filename) {
        
        // create the PrintWriter object and write to file
        try(PrintWriter printWriter = new PrintWriter (new File(_filename));) {

            // get a reference to the ArrayList
            ArrayList<ListItem> tools = game.getTools();

            // output a heading for the report
            printWriter.println ("List of tools in inventory:\n");
   
            // Get the data from the ArrayList and write it to file
            for (ListItem tool: tools) {
                printWriter.println(tool.getName() + "\t" + tool.getNumber());
            }
            // Success message
            System.out.println("List of tools successfully written to " 
                    + _filename + ".txt");
             
        } catch (Exception e) {
            // Output error message
            System.out.println("Unable to save tools list to file");
        }
    }
    
    /**
     * printProvisions method
     * Purpose: print to file the tools array
     * Author: Christian
     */
    public static void printProvisions(String _filename) {
        
        // create the PrintWriter object and write to file
        try(PrintWriter printWriter = new PrintWriter (new File(_filename));) {

            // get a reference to the ArrayList
            ArrayList<ListItem> provisions = game.getProvisions();

            // output a heading for the report
            printWriter.println ("List of Provisions in inventory:\n");
   
            // Get the data from the ArrayList and write it to file
            for (ListItem provision: provisions) {
                printWriter.println(provision.getName() + "\t" + provision.getNumber());
            }
            // Success message
            System.out.println("List of provisions successfully written to " 
                    + _filename + ".txt");
             
        } catch (Exception e) {
            // Output error message
            System.out.println("Unable to save provisions list to file");
        }
    
}   

    

}
