/* The MainMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Ching Lo, Kachia Vang, Christian Juarez
 * Date last modified:  2018
 * -------------------------------------------------------------
 */
package view;

import cityofaaron.CityOfAaron;
import control.*;


// adding extends keword so this class inherits from MenuView
public class MainMenuView extends MenuView{
/* 
Delete these variable declarations. They will be inherited from the abstract class MenuView
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
*/
    
// The MainMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
    public MainMenuView() {
           super( "\n"
                + "**********************************\n"
                + "           CITY OF AARON          \n"
                + "          MAIN GAME MENU          \n"
                + "**********************************\n"
                + " 1 - Start new game\n"
                + " 2 - Get and start a saved game\n"
                + " 3 - Get help on playing the game\n"
                + " 4 - Save game\n"
                + " 5 - Quit\n",     // arguments " , "
                5);
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // =================================== 
    
    // Add the @Override annotation to the doAction( ) method
    @Override public void doAction(int option) {
        switch (option) {
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4: // save game
                saveGame();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
                break;
        }
    }

    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startNewGame() {
        //   System.out.println("\nStart new game option selected."); // the stub

        // Display the Banner Page.
        System.out.println("\nWelcome to the city of Aaron You have been elected to assume your role as the ruler of the city. "
                + "\nYou have the task to purchase and sell land, making sure you have enough wheat to feed your people. "
                + "\nAny miscalculation in doing so will result in the death of your people. "
                + "\nYou want to make sure you do a good job or else you will lose your role as ruler.");
        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
        // Call the createNewGame() method in the GameControl class
        GameControl.createNewGame(name);

        // Display a welcome message
        System.out.println("Welcome " + name + " have fun!!!");
        // Display the Game menu

        // Display the Game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();

    }

    // The startSavedGame method
    // Purpose: loads a saved game object from disk and start the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startSavedGame() {
        System.out.println("\nStart saved game option selected."); // the stub
        
        // get rid of nl character left in the stream
        keyboard.nextLine();

        // prompt user and get a file path
        System.out.println("What is the name of your game?");
        String filePath = keyboard.next();

        // call the getSavedGame( ) method in the GameControl class to load the game
        GameControl.getSavedGame(filePath);
        
        // display the game menu for the loaded game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
             
    }
    
    // the saveGame Method
    // Purpose: to save the existing game
    // Parameters: none
    // Return: none
    public void saveGame() {

        // prompt user and get a file path
        System.out.println("Please enter a name for your game.");
        String filePath = keyboard.next();

        // call the saveGame() method in the GameControl class to load the game
        GameControl.saveGame(filePath);

        System.out.println("Game saved into file: " + filePath);

        // display the game menu for the saved game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
    }

    // The displayHelpMenuView method
    // Purpose: displays the help menu 
    // ===================================     
    public void displayHelpMenuView() {
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayMenu();
    }

    // The displaySaveGameView method
    // Purpose: 
    // ===================================     
    public void displaySaveGameView() {
        System.out.println("\nStart save game view option selected.");
    }

    /**
     * loadSavedGame Method Purpose: loading a previously saved game
     */
    public void loadSavedGame() {
        System.out.println("This is the loadSavedGame method");
    }

    /**
     * displayHelpMenu Method Purpose: display help menu
     */
    public void displayHelpMenu() {
        System.out.println("This is the displayHelpMenu method");
    }

}
