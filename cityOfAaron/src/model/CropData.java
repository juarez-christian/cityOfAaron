/*
 * CIT-260
 * Fall 2018
 * Team members:  Ching Lo, Kachia Vang, Christian Juarez
 */
package model;

/**
 *
 * @author Ching Lo
 */

import java.io.Serializable;

public class CropData implements Serializable
{
    // data members (or instance variables) 
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted; 
    private int setOffering;
    
    // contains a public, empty constructor 
    public CropData() {};
    
    // public getter and setter for YEAR instance variable
    public int getYear(){
        return this.year;
    }
    public void setYear(int _year){
        this.year = _year;
    }
    
    //public getter and setter for POPULATION instance variable
    public int getPopulation(){
        return this.population;
    }
    public void setPopulation (int _population){
        this.population = _population;
    }
    
    //public getter and setter for ACRES OWNED instance variable
    public int getAcresOwned(){
        return this.acresOwned;
    }
    public void setAcresOwned (int _acresOwned){
        this.acresOwned = _acresOwned;
    }
    
    //public getter and setter for CROP YIELD instance variable
    public int getCropYield() {
        return this.cropYield;
    }
    public void setCropYield (int _cropYield) {
        this.cropYield = _cropYield;
    }
    
    //public getter and setter for WHEAT IN STORE instance variable
    public int getWheatInStore() {
        return this.wheatInStore;
    }
    public void setWheatInStore (int _wheatInStore) {
        this.wheatInStore = _wheatInStore;
    }
    
    //public getter and setter for NUMBER WHO DIED instance variable
    public int getNumberWhoDied() {
        return this.numberWhoDied;
    }
    public void setNumberWhoDied (int _numberWhoDied) {
        this.numberWhoDied = _numberWhoDied;
    }
    
    //public getter and setter for NEW PEOPLE instance variable
    public int getNewPeople() {
        return this.newPeople;
    }
    public void setNewPeople (int _newPeople) {
        this.newPeople = _newPeople;
    }
    
    //public getter and setter for HARVEST instance variable
    public int getHarvest() {
        return this.harvest;
    }
    public void setHarvest (int _harvest) {
        this.harvest = _harvest;
    }
    
    //public getter and setter for WHEAT FOR FOOD instance variable
    public int getWheatForFood() {
        return this.wheatForFood;
    }
    public void setWheatForFood (int _wheatForFood) {
        this.wheatForFood = _wheatForFood;
    }
    
    //public getter and setter for ACRES PLANTED instance variable
    public int getAcresPlanned() {
        return this.acresPlanted;
    }
    public void setAcresPlanted (int _acresPlanted) {
        this.acresPlanted = _acresPlanted;
    }
    
    //public getter and setter for SET OFFERING instance variable
    public int getSetOffering() {
        return this.setOffering;
    }
    public void setSetOffering (int _setOffering) {
        this.setOffering = _setOffering;
    }
}
