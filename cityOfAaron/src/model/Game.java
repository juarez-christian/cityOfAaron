/*
 * CIT-260
 * Fall 2018
 * Team members:  Ching Lo, Kachia Vang, Christian Juarez
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
    private CropData cropData;
    
    public Game() {};
    
    public Player getthePlayer()
    {
        return this.thePlayer;
    }
            
    public void setthePlayer(Player _thePlayer)
    {
        thePlayer = _thePlayer;
    }        

   public CropData getcropData()
    {
        return this.cropData;
    }
            
    public void setCropData(CropData _cropData)
    {
        cropData = _cropData;
    }       
       
}
