/*
 * 
 * CIT-260
 * Fall 2018
 *  Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */
package model;

/**
 *
 * @author _Chris_
 */
import java.io.Serializable;


public class Game implements Serializable
{
    private Player thePlayer;
    
    public Game() {};
    
    public Player getthePlayer()
    {
        return this.thePlayer;
    }
            
    public void setthePlayer(Player _thePlayer)
    {
        thePlayer = _thePlayer;
    }        
}
