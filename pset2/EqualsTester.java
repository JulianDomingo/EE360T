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
     * P2: Reflexive: For any non-null reference value x, x.equals(x) should return true.
     */
    @Test public void t1() {
        C c = new C("Hello.");
        assertTrue(c.equals(c));
    }

    /*
     * P3: Symmetric: For any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
     */
    @Test public void t2() {
        D d1 = new D("Salutations.", 10);
        D d2 = new D("Salutations.", 10);
        assertTrue(d1.equals(d2) && d2.equals(d1));
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
}

