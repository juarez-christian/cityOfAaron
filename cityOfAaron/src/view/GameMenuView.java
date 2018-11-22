/*
 * GameMenuView.java
 * The Player Class for the cityOfAaron project
 * @author Kachia Vang
 */
package view;

import cityofaaron.CityOfAaron;
import control.GameControl;
import java.util.Scanner;
import model.*;

public class GameMenuView extends MenuView {

private Game theGame = CityOfAaron.getTheGame();

    public GameMenuView() {
        super( "\n" 
                + "*********************************\n"
                + "** CITY OF AARON: IN-GAME MENU **\n"
                + "*********************************\n"
                + " 1 - View the map\n"
                + " 2 - View/Print a list\n"
                + " 3 - Move to a new location\n"
                + " 4 - Manage the crops\n"
                + " 5 - Return to the Main menu\n"
                , 5);
    }
    
     /**
     * doAction Method 
     * Purpose: Perform the actions selected by user
     * Pre-Conditions:
     * @param option user input 1-5
     * @returns none
     * ====================================================================
     */ 
        @Override public void doAction(int option) {
        switch(option)
        {
            case 1: // view map
                viewMap();
                break;
            case 2: // view lists menu
                viewList();
                break;
            case 3: // move to new location
                moveToNewLocation();
                break;
            case 4: // manage crops
                manageCrops();
                break;
            case 5: // return to main menu
                return;
        }
    }
        
    /**
     * viewMap Method 
     * Purpose: View map locations
     * Pre-Conditions:
     * @param
     * @returns none
     * ====================================================================
     */
    public void viewMap() {
       System.out.println("This is the viewMap method.");
    }

    /**
     * viewList Method 
     * Purpose: Creates a ListMenuView 
     *   and calls its displayMenu() method
     * Parameters: none
     * Returns: none
     * ====================================================================
     */
    public void viewList() {
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
    }

    /**
     * moveToNewLocation Method 
     * Purpose: Change players location    
     * Parameters: none
     * Return: none
     * ====================================================================
     */
    public void moveToNewLocation() {
        System.out.println("This is the moveToNewLocation method.");
    }

    /**
     * manageCrops Method 
     * Purpose: manage crops
     */
    public void manageCrops() {
        //Display the crop management view
        CropView.runCropView();
    }

}
   