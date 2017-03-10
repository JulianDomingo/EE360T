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
     * P4: It is transitive: for any non-null reference values x, y, and z,
     * if x.equals(y) returns true and y.equals(z) returns true, then
     * x.equals(z) should return true.
     */
    @Test public void t1() {

    }

    @Test public void t2() {

    }
}

