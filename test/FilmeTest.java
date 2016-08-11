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
public class FilmeTest {
    
    public FilmeTest() {
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
     * Test of getNome method, of class Filme.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Filme instance = new Filme();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNome method, of class Filme.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Filme instance = new Filme();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAno method, of class Filme.
     */
    @Test
    public void testGetAno() {
        System.out.println("getAno");
        Filme instance = new Filme();
        int expResult = 0;
        int result = instance.getAno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAno method, of class Filme.
     */
    @Test
    public void testSetAno() {
        System.out.println("setAno");
        int ano = 0;
        Filme instance = new Filme();
        instance.setAno(ano);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getClassificacao method, of class Filme.
     */
    @Test
    public void testGetClassificacao() {
        System.out.println("getClassificacao");
        Filme instance = new Filme();
        int expResult = 0;
        int result = instance.getClassificacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setClassificacao method, of class Filme.
     */
    @Test
    public void testSetClassificacao() {
        System.out.println("setClassificacao");
        int classificacao = 0;
        Filme instance = new Filme();
        instance.setClassificacao(classificacao);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
