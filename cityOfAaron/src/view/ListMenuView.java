/*
 * The ListMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Ching Lo (Juarez, Vang)
 * CIT 260:08
 * Date last modified: November 2018
 * -------------------------------------------------------------
 */
package view;
import java.util.Scanner;


public class ListMenuView {

    //  scanner
    Scanner keyboard = new Scanner(System.in);
    //private String
    private String listMenu;
    //private int max
    private int max;
    

    /*
     * The ListMenuView constructor
     * Purpose: to initialize the list menu data
     * Parameters: none
     * Returns: none
     */
    public ListMenuView() {
         listMenu = "\n"
                + "*********************************\n"
                + "** CITY OF AARON: LIST MENU **\n"
                + "*********************************\n"
                + " 1 - List or view the animals in the storehouse\n"
                + " 2 - List or view the tools in the storehouse\n"
                + " 3 - List or view the provisions in the storehouse\n"
                + " 4 - List or view the developers of this game\n"
                + " 5 - Return to the Game Menu\n";
        max = 5;
    }
    
    /*
     * The displayMenuView Method 
     * Purpose: To dislay the List Menu 
     * Parameters: none
     * Returns: none
     */
    public void displayListMenuView() {
        int menuOption;
        do {
            // display the game menu
            System.out.println(listMenu);
            // get user input
            menuOption = getListMenuOption();
            // perform user action
            doAction(menuOption);

        } while (menuOption != max);
    }
    
    /*
     * The getMenuOption Method 
     * Purpose: To get users to input for list option
     * Parameters: none
     * Returns: none
     */
    public int getListMenuOption() {
        int userInput = 0;
        final int MAX = 5;

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

        // return userinput
        return userInput;
    }

    /*
     * The doAction method
     * Purpose: to perform the selected action
     * Parameters: none
     * Returns: none
     */
    public void doAction(int option) {
        switch (option) {
            case 1: //list of animals in storehouse
                viewAnimals();
                break;
            case 2: //list of tools in storehouse
                viewTools();
                break;
            case 3: //list of provisions in storehouse
                viewProvisions();
                break;
            case 4: //list of game developers
                viewDevelopers();
                break;
            case 5: //back to Game Menu
                GameMenuView gameMenu  = new GameMenuView();
                gameMenu.displayGameMenuView();
        }
    }
    
    /*
     * listAnimals Method 
     * write stub for action method
     */
    public void viewAnimals() {
        System.out.println("This is the listAnimals method.");
    }
    
    /*
     * listTools Method 
     * write stub for action method
     */
    public void viewTools() {
        System.out.println("This is the listTools method.");
    }
    
    /*
     * listProvisions Method 
     * write stub for action method
     */
    public void viewProvisions() {
        System.out.println("This is the listProvisions method.");
    }
    
    /*
     * listTeams Method 
     * write stub for action method
     */
    public void viewDevelopers() {
        System.out.println("This is the listDevelopers method.");
    }

    
}
