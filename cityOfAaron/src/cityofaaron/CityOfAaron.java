/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */

package cityofaaron;
import model.*;
/**
 *
 * @author _Chris_
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        
        // player object creation
        Player myPlayer = new Player();
        
        myPlayer.setName("Chris");
        
        // game object creation
        Game myGame = new Game();
        myGame.setthePlayer(myPlayer);
        
        System.out.println("The player's name is: " + myGame.getthePlayer().getName() +"");
        
        // team member object
        System.out.println("The team member name is: " + TeamMember.member1.getName());
        System.out.println("The title is: "+ TeamMember.member1.getTitle());
        
        
        // list item class instantiated
        ListItem myItem = new ListItem();
        
        myItem.setName("rake");
        myItem.setNumber(97);
        
        System.out.println("Description: " + myItem.getName());
        System.out.println("Quantity :" + myItem.getNumber());

        System.out.println("Test Kachia");
    }   
    
}
