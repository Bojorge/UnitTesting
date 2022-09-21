package com.mycompany.pruebas_unitarias;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bojorge
 */
public class SumaTest {
    
    public SumaTest() {
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        Suma instance = new Suma();
        int expResult = 0;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testIncrementar() {
        System.out.println("incrementar");
        int a = 0;
        Suma instance = new Suma();
        int expResult = 0;
        int result = instance.incrementar(a);
        assertEquals(expResult, result);
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
}
