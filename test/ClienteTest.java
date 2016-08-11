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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getCodCliente method, of class Cliente.
     */
    @Test
    public void testGetCodCliente() {
        System.out.println("getCodCliente");
        Cliente instance = new Cliente();
        double expResult = 0.0;
        double result = instance.getCodCliente();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCodCliente method, of class Cliente.
     */
    @Test
    public void testSetCodCliente() {
        System.out.println("setCodCliente");
        double codCliente = 0.0;
        Cliente instance = new Cliente();
        instance.setCodCliente(codCliente);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPreferencia method, of class Cliente.
     */
    @Test
    public void testGetPreferencia() {
        System.out.println("getPreferencia");
        Cliente instance = new Cliente();
        String expResult = null;
        String result = instance.getPreferencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPreferencia method, of class Cliente.
     */
    @Test
    public void testSetPreferencia() {
        System.out.println("setPreferencia");
        String preferencia = "";
        Cliente instance = new Cliente();
        instance.setPreferencia(preferencia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDesconto method, of class Cliente.
     */
    @Test
    public void testGetDesconto() {
        System.out.println("getDesconto");
        Cliente instance = new Cliente();
        String expResult = null;
        String result = instance.getDesconto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDesconto method, of class Cliente.
     */
    @Test
    public void testSetDesconto() {
        System.out.println("setDesconto");
        String desconto = "";
        Cliente instance = new Cliente();
        instance.setDesconto(desconto);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
