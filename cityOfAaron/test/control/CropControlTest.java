/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juarez_Lo_Vang
 */
public class CropControlTest {
    
    public CropControlTest() {
        
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLandTestCase1() {
        System.out.println("sellLand - Test Case 1");
        CropData cropData = new CropData();
        cropData.setAcresOwned(2800);
        int landPrice = 20;
        int acresToSell = 10;
        int expResult = 2790;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);  
    }
    
    
    
    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLandTestCase2() {
        System.out.println("sellLand - Test Case 2");
        CropData cropData = new CropData();
        cropData.setAcresOwned(2800);
        int landPrice = 20;
        int acresToSell = -5;
        int expResult = -1;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);  
    }
    
    
    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLandTestCase3() {
        System.out.println("sellLand - Test Case 3");
        CropData cropData = new CropData();
        cropData.setAcresOwned(2800);
        int landPrice = 20;
        int acresToSell = 3000;
        int expResult = -1;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);  
    }
    
    
    
    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLandTestCase4() {
        System.out.println("sellLand - Test Case 4");
        CropData cropData = new CropData();
        cropData.setAcresOwned(2000);
        int landPrice = 10;
        int acresToSell = 2000;
        int expResult = 0;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);  
    }
    
    
    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLandTestCase5() {
        System.out.println("sellLand - Test Case 5");
        CropData cropData = new CropData();
        cropData.setAcresOwned(2000);
        int landPrice = 10;
        int acresToSell = 0;
        int expResult = 2000;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);  
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLandTestCase1() {
        System.out.println("buyLand - Test Case 1");
        CropData cropData = new CropData();
        cropData.setWheatInStore(2500);
        int landPrice = 20;
        int acresToBuy = 20;
        int expResult = 2520;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        
    }
    
    
    
    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLandTestCase2() {
        System.out.println("buyLand - Test Case 2");
        CropData cropData = new CropData();
        cropData.setWheatInStore(2500);
        int landPrice = 20;
        int acresToBuy = -2;
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        
    }
    
    
    
    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLandTestCase3() {
        System.out.println("buyLand - Test Case 3");
        CropData cropData = new CropData();
        cropData.setWheatInStore(2500);
        int landPrice = 20;
        int acresToBuy = 3000;
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        
    }
    
    
    
    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLandTestCase4() {
        System.out.println("buyLand - Test Case 4");
        CropData cropData = new CropData();
        cropData.setWheatInStore(2000);
        int landPrice = 10;
        int acresToBuy = 200;
        int expResult = 2200;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        
    }
    
    
    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLandTestCase5() {
        System.out.println("buyLand - Test Case 5");
        CropData cropData = new CropData();
        cropData.setWheatInStore(2000);
        int landPrice = 10;
        int acresToBuy = 0;
        int expResult = 2000;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        
    }

    
    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOfferingTestCase1() {
        System.out.println("setOffering - Test Case 1");
        CropData cropData = new CropData();
        int payOffering = 10;
        int expResult = 10;
        int result = CropControl.setOffering(payOffering, cropData);
        assertEquals(expResult, result);
     
    }
    
    
    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOfferingTestCase2() {
        System.out.println("setOffering - Test Case 2");
        CropData cropData = new CropData();
        int payOffering = -10;
        int expResult = -1;
        int result = CropControl.setOffering(payOffering, cropData);
        assertEquals(expResult, result);
     
    }
    
    
    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOfferingTestCase3() {
        System.out.println("setOffering - Test Case 3");
        CropData cropData = new CropData();
        int payOffering = 110;
        int expResult = -1;
        int result = CropControl.setOffering(payOffering, cropData);
        assertEquals(expResult, result);
     
    }
    
    
    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOfferingTestCase4() {
        System.out.println("setOffering - Test Case 4");
        CropData cropData = new CropData();
        int payOffering = 0;
        int expResult = 0;
        int result = CropControl.setOffering(payOffering, cropData);
        assertEquals(expResult, result);
     
    }
    
    
    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOfferingTestCase5() {
        System.out.println("setOffering - Test Case 5");
        CropData cropData = new CropData();
        int payOffering = 100;
        int expResult = 100;
        int result = CropControl.setOffering(payOffering, cropData);
        assertEquals(expResult, result);
     
    }
    
    /**
     * Test of feedPeople method, of class CropControl.
     */
     @Test
    public void testFeedPeopleTestCase1() {
        System.out.println("feedPeople - Test Case 1");
        CropData cropData = new CropData ();
        cropData.setWheatInStore(2700);
        cropData.setWheatForFood(1000);
        int wheatForFood = 200;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        int expResult = 1200;
        assertEquals(expResult, result);  
    }
    /**
     * Test of feedPeople method, of class CropControl.
     */
     @Test
    public void testFeedPeopleTestCase2() {
        System.out.println("feedPeople - Test Case 2");
        CropData cropData = new CropData ();
        cropData.setWheatInStore(2700);
        cropData.setWheatForFood(1000);
        int wheatForFood = -10;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        int expResult = -1;
        assertEquals(expResult, result);  
    }
    /**
     * Test of feedPeople method, of class CropControl.
     */
     @Test
    public void testFeedPeopleTestCase3() {
        System.out.println("feedPeople - Test Case 3");
        CropData cropData = new CropData ();
        cropData.setWheatInStore(2700);
        cropData.setWheatForFood(1000);
        int wheatForFood = 3000;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        int expResult = -1;
        assertEquals(expResult, result);  
    }
    /**
     * Test of feedPeople method, of class CropControl.
     */
     @Test
    public void testFeedPeopleTestCase4() {
        System.out.println("feedPeople - Test Case 4");
        CropData cropData = new CropData ();
        cropData.setWheatInStore(2700);
        cropData.setWheatForFood(1000);
        int wheatForFood = 0;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        int expResult = 1000;
        assertEquals(expResult, result);  
    }
    /**
     * Test of feedPeople method, of class CropControl.
     */
     @Test
    public void testFeedPeopleTestCase5 () {
        System.out.println("feedPeople - Test Case 5");
        CropData cropData = new CropData ();
        cropData.setWheatInStore(2700);
        cropData.setWheatForFood(1000);
        int wheatForFood = 2700;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        int expResult = 3700;
        assertEquals(expResult, result);  
    }

    /*
     * Test of sellLand method, of class CropControl.
     *
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 0;
        int acresToSell = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyLand method, of class CropControl.
     *
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int landPrice = 0;
        int acresToBuy = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOffering method, of class CropControl.
     *
    @Test
    public void testSetOffering() {
        System.out.println("setOffering");
        int payOffering = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.setOffering(payOffering, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of feedPeople method, of class CropControl.
     *
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatForFood = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.feedPeople(wheatForFood, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
