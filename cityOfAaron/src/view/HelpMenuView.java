/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;

/**
 *
 * @author _Chris_
 */
 
public class HelpMenuView {

    Scanner keyboard = new Scanner(System.in);
    private String helpMenu;
    private int max;

// The helpMenuView constructor
// Purpose: Initialize the help menu data
// Parameters: none
// Returns: none
// ===================================
    public HelpMenuView() {
        helpMenu = "\n" +
                "**************************************************\n" +
                "                  CITY OF AARON                   \n" +
                "                    HELP MENU                     \n" +
                "**************************************************\n" 
                + " 1 - What are the goals of the game?\n"
                + " 2 - Where is the city of Aaron?\n"
                + " 3 - How do I view the map?\n"
                + " 4 - How to I move to another location?\n"
                + " 5 - How do I display a list of animals,\n "
                + "    provisions and tools in the city storehouse?\n"
                + " 6 - Back to the Main Menu.\n";

        max = 6;
    }

    // The displayHelpMenuView method
    // Purpose: displays the help menu of the game
    // Parameters: none
    // Returns: none
    // ===================================   
    public void displayHelpMenuView() {
        int helpMenuOption;
        do {
            // Display the help Menu
            System.out.println(helpMenu);

            // Prompt the user and get the user’s input
            helpMenuOption = getHelpMenuOption();

            // Perform the desired action
            doAction(helpMenuOption);

        } while (helpMenuOption != max);
    }

    // The getHelpMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getHelpMenuOption() {
        // declare a variable to hold user’s input
        int userInput = 0;
        final int MAX = 6;
        Scanner keyboard = new Scanner(System.in);

        // begin loop
        do {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > MAX) {
                System.out.println("Error: you must select 1, 2, 3, 4, 5, or 6");
            }
            // loop back to the top of the loop if input was not valid
            // end loop
        } while (userInput < 1 || userInput > MAX);
        return userInput;

    }

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option) {
        switch (option) {
            case 1: // create and start a new game
                goals();
                break;
            case 2: // get and start a saved game
                location();
                break;
            case 3: // get help menu
                map();
                break;
            case 4: // save game
                movements();
                break;
             case 5: // save game
                store();
                break;   
             case 6:
                MainMenuView mmv = new MainMenuView();
                mmv.displayMenuView();
                break;
        }
    }

    // The goals method
    // Purpose: display the goals of the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void goals() {

        // Display the Banner Page.
        System.out.println("\nWelcome to the city of Aaron. The goals you have as a ruler of the city are: "
                + "\nTo harve the land to produce enough wheat to feed your people. "
                + "\nRemember new people is leaving and coming the city,"
                + " so your tasks are sell and purchase land as the population demand. ");
      
    }
  

    
    // The location method
    // Purpose: display where is the city of Aaron
    // Parameters: none
    // Returns: none
    // ===================================     
    public void location() {

        // Display the Banner Page.
        System.out.println("\nThe location of the city is confidential.");
       
    }

    
    
    // The map method
    // Purpose: display instructions to see the map
    // Parameters: none
    // Returns: none
    // ===================================     
    public void map() {

        // Display the Banner Page.
        System.out.println("\nThe map");
        
          }

    
    
    // The movements method
    // Purpose: display instuctions to move the player to another location
    // Parameters: none
    // Returns: none
    // ===================================     
    public void movements() {

        // Display the Banner Page.
        System.out.println("\nthe locations in the city of Aaron.");
          
    }

    
    
    // The store method
    // Purpose: display instructions to see what is in the storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void store() {

        // Display the Banner Page.
        System.out.println("\nHello, this is the storehouse.");
      
    }

        
      
}

   

        

