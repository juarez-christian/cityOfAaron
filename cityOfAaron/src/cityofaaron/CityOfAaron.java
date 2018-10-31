/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */

package cityofaaron;
import model.*;
import view.*;
/**
 *
 * @author _Juarez_Lo_Vang
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    
        // main function - entry point for the program
        // runs the main menu
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();       

    
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
        
        // list item class instantiated by Juarez

        // Location class instantiated
        Location myLocation = new Location();
        
        myLocation.setDescription("My Place");
        myLocation.setSymbol("∆");
        
        System.out.println("myLocation description: " + myLocation.getDescription());
        System.out.println("myLocation symbol = " + myLocation.getSymbol());
        
        // list item class instantiated by Juarez
        ListItem myItem = new ListItem();
        
        myItem.setName("rake");
        myItem.setNumber(97);
        
        System.out.println("Description: " + myItem.getName());
        System.out.println("Quantity :" + myItem.getNumber());
        
        //CropData class instantiated by Lo
        CropData myCropData = new CropData();
        //values set up for testing
        myCropData.setYear(1830);
        myCropData.setPopulation(3724);
        myCropData.setAcresOwned(5000);
        myCropData.setCropYield(700);
        myCropData.setWheatInStore(2700);
        myCropData.setNumberWhoDied(5);
        myCropData.setNewPeople(75);
        myCropData.setHarvest(300);
        myCropData.setWheatForFood(200);
        myCropData.setAcresPlanted(500);
        //testing the class
        System.out.println("The City of Aaron was founded in " + myCropData.getYear()
        + ".\nOur population was " + myCropData.getPopulation() 
	+ ".\nAt that time, we owned " + myCropData.getAcresOwned() 
	+ " acres of land. Crop yield was " + myCropData.getCropYield() 
	+ " and the total number of bushels of wheat in store was " + myCropData.getWheatInStore() 
	+ ".\nWe lost " + myCropData.getNumberWhoDied() 
        + " dear friends, and we welcomed " + myCropData.getNewPeople() 
	+ " new people.\nWe were blessed with an abundance of harvest, which amounted to " + myCropData.getHarvest() 
        + " bushels of wheat, and brought forth " + myCropData.getWheatForFood() 
        + " pounds of wheat for food.\nFor next year's harvest, we will plan to plant on " + myCropData.getAcresPlanned() 
        + " acres of land.");
       
    }
        
}   
    
