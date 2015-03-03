/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursarc.cursac;

import junit.framework.TestCase;

/**
 *
 * @author RITA
 */
public class sumaTest extends TestCase {
    
    public sumaTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of sumar method, of class suma.
     */
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        suma instance = new suma();
        int expResult = 0;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
