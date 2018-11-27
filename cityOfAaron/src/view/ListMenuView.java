/*
 * The ListMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Ching Lo (Juarez, Vang)
 * CIT 260:08
 * Date last modified: November 2018
 * -------------------------------------------------------------
 */
package view;
import cityofaaron.CityOfAaron;
import control.GameControl;
import java.util.ArrayList;
import java.io.PrintStream;
import model.*;


public class ListMenuView extends MenuView{
    private Game game = CityOfAaron.getTheGame();
    /*
     * The ListMenuView constructor
     * Purpose: to initialize the list menu data
     * Parameters: none
     * Returns: none
     */
    public ListMenuView() {
         super( "\n" + 
                 "*********************************\n" +
                 "** CITY OF AARON: LIST MENU **\n" +
                 "*********************************\n" +
                 " 1 - List or view the animals in the storehouse\n" +
                 " 2 - List or view the tools in the storehouse\n" +
                 " 3 - List or view the provisions in the storehouse\n" +
                 " 4 - List or view the developers of this game\n" +
                 " 5 - Return to the Game Menu\n"
                 ,5);
    }
    
    /**
     * The doAction method
     * Purpose: To perform the player's desired action<p>
     * @param option
     * @Param none
     */
    @Override public void doAction(int option) {
        switch (option) {
            case 1: //List the animals
                listAnimals();
                break;
            case 2: //List tools
                listTools();
                break;
            case 3: //List provisions
                listProvisions();
                break;
            case 4: //List developers
                listTeam();
                break;
            case 5: //Return to the calling menu
                    }
    }
    
    /**
     * Purpose: Display the list of animals that the player has<p>
     * @Param none
     * Author: Ching Lo
     */
    public void listAnimals() {
        // System.out.println("Display a list of animals here"); //removed stub
        // display list code
        ArrayList<ListItem> animals = game.getAnimals();
        System.out.println("City of Aaron - Animal List");
        
        /*System.out.println("Here is a list of animals\n" +
                "------------------------------------");
        for (ListItem animal: animals) {
            System.out.println(animal.getName() + "\t" + animal.getNumber());
        }
        */
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %30s", "ANIMALS", "QUANTITY");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(ListItem animal: animals){
            System.out.format("%10s %30s",animal.getName(), animal.getNumber());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
    
    /**
     * Purpose: Display the list of tools that the player has<p>
     * @Param none
     * Author: Kachia
     */
    public void listTools() {
        // get the tools list from game object
        ArrayList<ListItem> tools = game.getTools();
        
        // Print off header
        System.out.println("City of Aaron tool list");
        System.out.println("Here is a list of tools\n" +
                "------------------------------------");
        
        // Print off tools and quantities
        for (ListItem tool: tools) {
            System.out.println(tool.getName() + "\t" + tool.getNumber());
        }
    }
    
    /*
     * Purpose: Display the list the provisions that the player has<p>
     * @Param none
     * Author: Christian
     */     
    public void listProvisions() {
      // System.out.println("Display a list of provisions here");
      // get the ArrayList from the Game object
      ArrayList<ListItem> provisions = game.getProvisions();
        System.out.println("City of Aaron - Provisions List");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %30s", "PROVISION", "QUANTITY");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(ListItem provision: provisions){
            System.out.format("%10s %30s",provision.getName(), provision.getNumber());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }    
    
    /*
     * Purpose: List the team members that created this application<p>
     * @Param none
     * Author: Ching Lo
     */
    public void listTeam() {
        // System.out.println("Display the team members here");
        ArrayList<ListItem> team = game.getTeam();
        System.out.println("City of Aaron - Team Members List");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %30s", "MEMBERS", "QUANTITY");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(ListItem teams: team){
            System.out.format("%10s %30s",teams.getName(), teams.getNumber());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

}

        
  