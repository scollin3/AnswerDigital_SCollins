/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCart;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sophie
 */
public class SKUTest {
    
    public SKUTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class SKU.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        SKU.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SKU.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        SKU instance = new SKU();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class SKU.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        SKU instance = new SKU();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFile method, of class SKU.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        SKU instance = new SKU();
        instance.readFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductCode method, of class SKU.
     */
    @Test
    public void testGetProductCode() {
        System.out.println("getProductCode");
        SKU instance = new SKU();
        ArrayList expResult = null;
        ArrayList result = instance.getProductCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class SKU.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        SKU instance = new SKU();
        ArrayList expResult = null;
        ArrayList result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class SKU.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        SKU instance = new SKU();
        ArrayList expResult = null;
        ArrayList result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOffer method, of class SKU.
     */
    @Test
    public void testGetOffer() {
        System.out.println("getOffer");
        SKU instance = new SKU();
        ArrayList expResult = null;
        ArrayList result = instance.getOffer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductCode method, of class SKU.
     */
    @Test
    public void testSetProductCode() {
        System.out.println("setProductCode");
        ArrayList productCodeColumn = null;
        SKU instance = new SKU();
        instance.setProductCode(productCodeColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class SKU.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        ArrayList descriptionColumn = null;
        SKU instance = new SKU();
        instance.setDescription(descriptionColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class SKU.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        ArrayList priceColumn = null;
        SKU instance = new SKU();
        instance.setPrice(priceColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOffer method, of class SKU.
     */
    @Test
    public void testSetOffer() {
        System.out.println("setOffer");
        ArrayList offerColumn = null;
        SKU instance = new SKU();
        instance.setOffer(offerColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
