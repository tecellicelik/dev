/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tecelli
 */
public class TestProjectTest {
    TestProject math;

    @Before
    public void setUp() {
        math=new TestProject(6, 36);
    }
    
    /**
     * Test of add method, of class Math.
     */
    @Test
    public void testAdd() {
        Assert.assertEquals(4, math.add());
    }
    
}
