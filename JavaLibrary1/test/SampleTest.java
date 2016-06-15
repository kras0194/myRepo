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
 * @author sebastian
 */
public class SampleTest {
    
    public SampleTest() {
    }
    
    @Test
    public void testDodaj() {
        System.out.println("SampleTest - dodaj() - Test metody");
        Sample sample = new Sample();
        assertTrue(6 == sample.Dodaj(3, 3));
    }
    
}
