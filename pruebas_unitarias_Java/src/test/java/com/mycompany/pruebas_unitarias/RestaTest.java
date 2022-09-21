package com.mycompany.pruebas_unitarias;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bojorge
 */
public class RestaTest {
    
    public RestaTest() {
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        Resta instance = new Resta();
        int expResult = 7;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testDecrementar() {
        System.out.println("decrementar");
        int a = 1;
        Resta instance = new Resta();
        int expResult = 0;
        int result = instance.decrementar(a);
        assertEquals(expResult, result);
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
}
