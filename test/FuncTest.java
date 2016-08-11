/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20131064010061
 */
public class FuncTest {
    
    public FuncTest() {
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
     * Test of getCarteiraTrab method, of class Func.
     */
    @Test
    public void testGetCarteiraTrab() {
        System.out.println("getCarteiraTrab");
        Func instance = new Func();
        String expResult = null;
        String result = instance.getCarteiraTrab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCarteiraTrab method, of class Func.
     */
    @Test
    public void testSetCarteiraTrab() {
        System.out.println("setCarteiraTrab");
        String carteiraTrab = "";
        Func instance = new Func();
        instance.setCarteiraTrab(carteiraTrab);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSetor method, of class Func.
     */
    @Test
    public void testGetSetor() {
        System.out.println("getSetor");
        Func instance = new Func();
        String expResult = null;
        String result = instance.getSetor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSetor method, of class Func.
     */
    @Test
    public void testSetSetor() {
        System.out.println("setSetor");
        String setor = "";
        Func instance = new Func();
        instance.setSetor(setor);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCargaHor method, of class Func.
     */
    @Test
    public void testGetCargaHor() {
        System.out.println("getCargaHor");
        Func instance = new Func();
        int expResult = 0;
        int result = instance.getCargaHor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCargaHor method, of class Func.
     */
    @Test
    public void testSetCargaHor() {
        System.out.println("setCargaHor");
        int cargaHor = 0;
        Func instance = new Func();
        instance.setCargaHor(cargaHor);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
