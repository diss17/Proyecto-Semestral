package Fisicas;

import Objetos.AutoPista;
import Objetos.Automovil;
import java.awt.Color;
import java.awt.Rectangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testeos de colisiones
 *
 * @author Daniel Soto
 * @author Franchesca Mora
 * @author Gaspar Jimenez
 */
public class BoxColliderTest {

    AutoPista testing = new AutoPista();
    Automovil Auto;
    Rectangle Exterior;
    Rectangle Interior;
    Rectangle Meta;

    public BoxColliderTest() {
    }

    @Before
    public void setUp() {
        Auto = new Automovil(585, 80, 800, Color.RED);//Se instancia el auto en las coordenadas por default
        Exterior = testing.Exterior();
        Interior = testing.Interior();
        Meta = testing.Meta();
    }

    @After
    public void tearDown() {
        Auto = null;
        Exterior = null;
        Interior = null;
        Meta = null;
    }

    /**
     * Test of CheckColliderInt method, of class BoxCollider.
     */
//    Test que comprueba que mientras el auto este dentro del rectanglo
//    interior que simula el borde interior de la pista ocasiona una colision
    @Test

    public void testCheckColliderInt() {
        Auto = new Automovil(Interior.getCenterX(), Interior.getCenterY(), 800, Color.RED);
        System.out.println("" + Interior.getCenterX() + Interior.getCenterY());
        System.out.println("CheckColliderInt");
        BoxCollider instance = new BoxCollider();
        boolean expResult = true;
        boolean result = instance.CheckColliderInt(Auto, Interior);
        assertEquals(expResult, result);
    }

    /**
     * Test of CheckColliderExt method, of class BoxCollider.
     */
//    Test de colision que comprueba que el auto estando en el borde exterior
//    de la pista provoca una colision siempre
    @Test
    public void testCheckColliderExt() {
        Auto = new Automovil(Exterior.height, Exterior.width, 800, Color.RED);
        System.out.println("" + Exterior.height + Exterior.width);
        System.out.println("CheckColliderExt");
        BoxCollider instance = new BoxCollider();
        boolean expResult = true;
        boolean result = instance.CheckColliderExt(Auto, Exterior);
        assertEquals(expResult, result);
    }

    /**
     * Test of CheckColliderMeta method, of class BoxCollider.
     */
//    Test que verifica que siempre cuando el auto este en la meta sea una
//    colision 
    @Test
    public void testCheckColliderMeta() {
        System.out.println("CheckColliderMeta");
        Auto = new Automovil(Meta.getCenterX(), Meta.getCenterY(), 800, Color.RED);
        System.out.println("" + Meta.getCenterX() + Meta.getCenterY());
        BoxCollider instance = new BoxCollider();
        boolean expResult = true;
        boolean result = instance.CheckColliderMeta(Auto, Meta);
        assertEquals(expResult, result);
    }

    /**
     * Test2 of CheckColliderInt method, of class BoxCollider.
     */
//    Test que comprueba que mientras el auto este fuera del rectanglo
//    interior que simula el borde interior de la pista NO ocasiona una colision 
    @Test
    public void test2CheckColliderInt() {
        System.out.println("CheckColliderInt");
        BoxCollider instance = new BoxCollider();
        boolean expResult = false;
        boolean result = instance.CheckColliderInt(Auto, Interior);
        assertEquals(expResult, result);
    }

    /**
     * Test2 of CheckColliderExt method, of class BoxCollider.
     */
//    Test de colision que comprueba que el auto estando dentro del rectangulo 
//    que simula el borde exterior de la pista NO genera una colision
    @Test
    public void test2CheckColliderExt() {
        System.out.println("CheckColliderExt");
        BoxCollider instance = new BoxCollider();
        boolean expResult = false;
        boolean result = instance.CheckColliderExt(Auto, Exterior);
        assertEquals(expResult, result);
    }

    /**
     * Test2 of CheckColliderMeta method, of class BoxCollider.
     */
//    Test que verifica que siempre cuando el auto este fuera de la meta NO sea
//    colision 
    @Test
    public void test2CheckColliderMeta() {
        System.out.println("CheckColliderMeta");
        BoxCollider instance = new BoxCollider();
        boolean expResult = false;
        boolean result = instance.CheckColliderMeta(Auto, Meta);
        assertEquals(expResult, result);
    }
}
