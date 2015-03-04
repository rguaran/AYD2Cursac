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
public class restaTest extends TestCase {
    
    public restaTest(String testName) {
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
     * Test of restar method, of class resta.
     */
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        resta instance = new resta();
        int expResult = 0;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
