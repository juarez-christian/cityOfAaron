/* The MainMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Ching Lo, Kachia Vang, Christian Juarez
 * Date last modified:  2018
 * -------------------------------------------------------------
 */
package view;

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

    
/*    
Delete the code for these methods from the MainMenuView class.
We want this class to use the code for these methods that 
is in the base abstract MenuView class.

    
    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================   
    public void displayMenuView() {
        int menuOption;
        do {
            // Display the menu
            System.out.println(theMenu);

            // Prompt the user and get the user’s input
            menuOption = getMenuOption();

            // Perform the desired action
            doAction(menuOption);

        } while (menuOption != max);
    }

    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption() {
        // declare a variable to hold user’s input
        int userInput = 0;
        final int MAX = 5;
        Scanner keyboard = new Scanner(System.in);

        // begin loop
        do {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > MAX) {
                System.out.println("Error: you must select 1, 2, 3, 4, or 5");
            }
            // loop back to the top of the loop if input was not valid
            // end loop
        } while (userInput < 1 || userInput > MAX);
        return userInput;

    }
*/
    
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
                displaySaveGameView();
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
    // Purpose: loads and starts a saved game 
    // ===================================     
    public void startSavedGame() {
        System.out.println("\nStart saved game option selected."); // the stub
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

    /**
     * saveGame Method Purpose: save the existing game
     */
    public void saveGame() {
        System.out.println("This is the saveGame method");
    }

}
