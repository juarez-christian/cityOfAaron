/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
