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
     */
    public void listAnimals() {
        // System.out.println("Display a list of animals here"); //removed stub
        // display list code

    }
    
    /**
     * Purpose: Display the list of tools that the player has<p>
     * @Param none
     */
    public void listTools() {
        System.out.println("Display a list of tools here");
    }

    /**
     * Purpose: Display the list the provisions that the player has<p>
     * @Param none
     */
    public void listProvisions() {
        System.out.println("Display a list of provisions here");
    }
    
    /**
     * Purpose: List the team members that created this application<p>
     * @Param none
     */
    public void listTeam() {
        System.out.println("Display the team members here");
    }

}
    