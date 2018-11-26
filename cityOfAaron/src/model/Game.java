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
import java.util.ArrayList;


public class Game implements Serializable
{
    private Player thePlayer;
    private CropData cropData;
    private Map theMap;
    
    /* 
    * Nov 21,2018 Added variables for Animals List, Tools List and Provisions List
    */
    //variable for keeping a reference to the animals ListItem object
    private ArrayList<ListItem> animals = null;
    //variable for keeping a reference to the tools ListItem object
    private ArrayList<ListItem> tools = null;
    //variable for keeping a reference to the provisions ListItem object
    private ArrayList<ListItem> provisions;
    //variable for keeping a reference to the Team List object
    private ArrayList<ListItem> team;
    
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

    public Map gettheMap()
    {
        return this.theMap;
    }

    public void settheMap(Map _theMap) 
    {  
        theMap = _theMap;
    }

    public ArrayList<ListItem> getAnimals()
    {
        return animals;
    }
           
    public void setAnimals(ArrayList<ListItem> animals) 
    {
        this.animals = animals;
    }
    
    public ArrayList<ListItem> getTools()
    {
        return tools;
    }
           
    public void setTools(ArrayList<ListItem> tools) 
    {
        this.tools = tools;
    }
    
    public ArrayList<ListItem> getProvisions()
    {
        return provisions;
    }
           
    public void setProvisions(ArrayList<ListItem> provisions) 
    {
        this.provisions = provisions;
    }

    public ArrayList<ListItem> getTeam() 
    {
        return team;
    }
    public void setTeam(ArrayList<ListItem> team)
    {
        this.team = team;
    }
    
    
}
