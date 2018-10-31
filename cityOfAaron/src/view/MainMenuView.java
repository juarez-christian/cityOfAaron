/*
 // The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Ching Lo, Kachia Vang, Christian Juarez
// Date last modified:  2018
//-------------------------------------------------------------

 */

package view;
import cityofaaron.*;
import control.*;
import model.*;

import java.util.Scanner;
/**
 *
 * @author _Chris_
 */

public class MainMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    
// The MainMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
public MainMenuView()
{
        theMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n";
        
        max = 5;
}
    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================   
    public void displayMenuView()
    {
int menuOption;
do
{
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
    public int getMenuOption()
    {
           // declare a variable to hold user’s input
            int userInput = 0;
            final int MAX = 5;
            Scanner keyboard = new Scanner(System.in);

           // begin loop
             do
             {
           // get user input from the keyboard
            userInput = keyboard.nextInt();
           // if it is not a valid value, output an error message
             if(userInput < 1 || userInput > MAX)
             System.out.println("Error: you must select 1, 2, 3, 4, or 5");
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
    public void doAction(int option)
    {
        switch(option)
        {
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
        }
    } 

    
    
    
    
     // The startNewGame method
 // Purpose: creates game object and starts the game
 // Parameters: none
 // Returns: none
 // ===================================     
 public void startNewGame()
 {
     System.out.println("\nStart new game option selected.");
 }

 
  // The startSavedGame method
 // Purpose: loads and starts a saved game 
 // Parameters: none
 // Returns: none
 // ===================================     
 public void startSavedGame()
 {
     System.out.println("\nStart saved game option selected.");
 }

 
 
  // The displayHelpMenuView method
 // Purpose: displays the help menu of the game
 // Parameters: none
 // Returns: none
 // ===================================     
 public void displayHelpMenuView()
 {
     System.out.println("\nStart display help menu view option selected.");
 }

 
 
  // The displaySaveGameView method
 // Purpose: 
 // Parameters: none
 // Returns: none
 // ===================================     
 public void displaySaveGameView()
 {
     System.out.println("\nStart save game view option selected.");
 }

  
    
    
    
    
    
   
}
