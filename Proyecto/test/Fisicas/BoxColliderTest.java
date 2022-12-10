/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Fisicas;

import Objetos.Automovil;
import java.awt.Color;
import java.awt.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class BoxColliderTest {

    public BoxColliderTest() {
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
     * Test of CheckColliderInt method, of class BoxCollider.
     */
    @Test
    public void testCheckColliderInt() {
        System.out.println("CheckColliderInt");
        Automovil a = new Automovil(585, 80, 800, Color.RED);;
        Rectangle l2 = new Rectangle();
        l2.x = 150;
        l2.y = 115;
        l2.width = 820;
        l2.height = 400;
        BoxCollider instance = new BoxCollider();
        boolean expResult = false;
        boolean result = instance.CheckColliderInt(a, l2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckColliderExt method, of class BoxCollider.
     */
    @Test
    public void testCheckColliderExt() {
        System.out.println("CheckColliderExt");
        Automovil a = new Automovil(585, 80, 800, Color.RED);
        Rectangle l1 = new Rectangle();
        l1.x = 50;
        l1.y = 40;
        l1.width = 1020;
        l1.height = 550;
        BoxCollider instance = new BoxCollider();
        boolean expResult = false;
        boolean result = instance.CheckColliderExt(a, l1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckColliderMeta method, of class BoxCollider.
     */
    @Test
    public void testCheckColliderMeta() {
        System.out.println("CheckColliderMeta");
        Automovil a = new Automovil(585, 80, 800, Color.RED);
        Rectangle meta = new Rectangle();
        meta.x = 540;
        meta.y = 40;
        meta.width = 30;
        meta.height = 75;
        BoxCollider instance = new BoxCollider();
        boolean expResult = false;
        boolean result = instance.CheckColliderMeta(a, meta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
