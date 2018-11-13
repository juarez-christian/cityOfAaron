/* The MainMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Ching Lo, Kachia Vang, Christian Juarez
 * Date last modified:  2018
*/
package view;

/**
 *
 * @author
 */
public interface ViewInterface {
    
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);
    
}
