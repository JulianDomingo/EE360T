/* Julian Domingo : jad5348 */

package pset2;

import static org.junit.Assert.*;
import org.junit.Test;


public class EqualsTester {
    C c1 = new C("1");
    C c2 = new C("1");
    C c3 = new C("1");

    D d1 = new D("1", 1);
    D d2 = new D("1", 1);
    D d3 = new D("1", 1);

    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = new Object();
    
    /* Null Tests */
    @Test public void nullPassObject() {
        assertFalse(new Object().equals(null));
    }

    @Test public void nullPassC() {
        assertFalse(new C("null").equals(null));
    }

    @Test public void nullPassD() {
        assertFalse(new D("null", 0).equals(null));
    }

    /* C Tests */
    @Test public void transitiveCCC() {
        assertTrue(c1.equals(c2) && c2.equals(c3) && c1.equals(c3));
    }

    @Test public void transitiveCCD() {
        assertFalse(c1.equals(c2) && c2.equals(d1) && c1.equals(d1));
    }

    @Test public void transitiveCCO() {
        assertFalse(c1.equals(c2) && c2.equals(o1) && c1.equals(o1));
    }

    @Test public void transitiveCDC() {
        assertFalse(c1.equals(d1) && d1.equals(c2) && c1.equals(c2));
    }

    @Test public void transitiveCDD() {
        assertFalse(c1.equals(d1) && d1.equals(d2) && c1.equals(d2));
    }

    @Test public void transitiveCDO() {
        assertFalse(c1.equals(d1) && d1.equals(o1) && c1.equals(o1));
    }

    @Test public void transitiveCOC() {
        assertFalse(c1.equals(o1) && o1.equals(c2) && c1.equals(c2));
    }

    @Test public void transitiveCOD() {
        assertFalse(c1.equals(o1) && o1.equals(d1) && c1.equals(d1));
    }

    @Test public void transitiveCOO() {
        assertFalse(c1.equals(o1) && o1.equals(o2) && c1.equals(o2));
    }

    /* D Tests */
    @Test public void transitiveDDD() {
        assertTrue(d1.equals(d2) && d2.equals(d3) && d1.equals(d3));
    }

    @Test public void transitiveDDC() {
        assertFalse(d1.equals(d2) && d2.equals(c1) && d1.equals(c1));
    }

    @Test public void transitiveDDO() {
        assertFalse(d1.equals(d2) && d2.equals(o1) && d1.equals(o1));
    }
    
    @Test public void transitiveDCC() {
        assertFalse(d1.equals(c1) && c1.equals(c2) && d1.equals(c2));
    }
    
    @Test public void transitiveDCD() {
        assertFalse(d1.equals(c1) && c1.equals(d2) && d1.equals(d2));
    }

    @Test public void transitiveDCO() {
        assertFalse(d1.equals(c1) && c1.equals(o1) && d1.equals(o1));
    }

    @Test public void transitiveDOC() {
        assertFalse(d1.equals(o1) && o1.equals(c1) && d1.equals(c1));
    }

    @Test public void transitiveDOD() {
        assertFalse(d1.equals(o1) && o1.equals(d2) && d1.equals(d2));
    }

    @Test public void transitiveDOO() {
        assertFalse(d1.equals(o1) && o1.equals(o2) && d1.equals(o2));
    }

    /* O Tests */
    @Test public void transitiveOOO() {
        assertFalse(o1.equals(o2) && o2.equals(o3) && o1.equals(o3));
    }

    @Test public void transitiveOOC() {
        assertFalse(o1.equals(o2) && o2.equals(c1) && o1.equals(c1));
    }    
    
    @Test public void transitiveOOD() {
        assertFalse(o1.equals(o2) && o2.equals(d1) && o1.equals(d1));
    }

    @Test public void transitiveOCO() {
        assertFalse(o1.equals(c1) && c1.equals(o2) && o1.equals(o2));
    }

    @Test public void transitiveOCC() {
        assertFalse(o1.equals(c1) && c1.equals(c2) && o1.equals(c2));
    }

    @Test public void transitiveOCD() {
        assertFalse(o1.equals(c1) && c1.equals(d1) && o1.equals(d1));
    }

    @Test public void transitiveODO() {
        assertFalse(o1.equals(d1) && d1.equals(o2) && o1.equals(o2));
    }

    @Test public void transitiveODC() {
        assertFalse(o1.equals(d1) && d1.equals(c1) && o1.equals(c1));
    }

    @Test public void transitiveODD() {
        assertFalse(o1.equals(d1) && d1.equals(d2) && o1.equals(d2));
    }    
}

