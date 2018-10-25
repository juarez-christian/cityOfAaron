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
 * @author _Chris_
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
}
