/* Julian Domingo : jad5348 */

package pset2;

import static.org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
    /*
     * P1: For any non-null reference value x, x.equals(null) should return false.
     */
    @Test public void t0() {
        assertFalse(new Object().equals(null));
    }

    /*
     * P4: Transitive: For any non-null reference values x, y, and z,
     * if x.equals(y) returns true and y.equals(z) returns true, then
     * x.equals(z) should return true.
     */
    @Test public void t3() {
        Object x = new Object();
        Object y = new Object();
        Object z = new Object();

        assertTrue(x.equals(y) && y.equals(z) == x.equals(z));
    }

    @Test public void nullPassC() {
        assertFalse(new C("null").equals(null));
    }

    @Test public void nullPassD() {
        assertFalse(new D("null", 0).equals(null));
    }

    /* C Tests */
    @Test public void cTransitiveWithC() {
        C c1 = new C("1");
        C c2 = new C("1");
        C c3 = new C("1");
        assertTrue((c1.equals(c2) && c2.equals(c3)) == c1.equals(c3));
    }

    @Test public void cTransitiveWithD() {
        C c1 = new C("1");
        C c2 = new C("1");
        D d1 = new D("1", 1);
        assertFalse((c1.equals(c2) && c2.equals(d1)) == c1.equals(d1));
    }

    @Test public void cTransitiveWithObject() {
        C c1 = new C("1");
        C c2 = new C("1");
        Object o1 = new Object();
        assertFalse((c1.equals(c2) && c2.equals(o1)) == c1.equals(o1));
    }

    /* D tests */
    @Test public void dTransitiveWithC() {
        D d1 = new D("1", 1);
        D d2 = new D("2", 2);
        C c1 = new C("1");
        assertFalse((d1.equals(d2) && d2.equals(c1)) == d1.equals(c1));
    }

    @Test public void dTransitiveWithD() {
        D d1 = new D("1", 1);
        D d2 = new D("1", 1);
        D d3 = new D("1", 1);
        assertTrue((d1.equals(d2) && d2.equals(d3)) == d1.equals(d3));
    }

    @Test public void dTransitiveWithObject() {
        D d1 = new D("1", 1);
        D d2 = new D("1", 1);
        Object o1 = new Object();
        assertFalse((d1.equals(d2) && d2.equals(o1)) == d1.equals(o1));
    }

    /* Object tests */
    @Test public void objectTransitiveWithC() {
        Object o1 = new Object();
        Object o2 = new Object();
        C c1 = new C("1");
        assertFalse((o1.equals(o2) && o2.equals(c1)) == o1.equals(c1));
    }

    @Test public void objectTransitiveWithD() {
        Object o1 = new Object();
        Object o2 = new Object();
        D d1 = new D("1", 1);
        assertFalse((o1.equals(o2) && o2.equals(d1)) == o1.equals(d1));
    }

    @Test public void objectTransitiveWithObject() {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        assertTrue((o1.equals(o2) && o2.equals(o3)) == o1.equals(o3));
    }

}

