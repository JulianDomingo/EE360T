/* Julian Domingo : jad5348 */

package pset2;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {
    @Test public void cTrueOneObject() {
        C c1 = new C("1");        
        assertTrue(c1.hashCode() == c1.hashCode());        
    }       

    @Test public void cTrueTwoObjects() {
        C c1 = new C("1");
        C c2 = new C("1");
        assertTrue(c1.hashCode() == c2.hashCode());
    }

    @Test public void cHashCodeFalse() {
        C c1 = new C("1");
        C c2 = new C("2");
        assertFalse(c1.hashCode() == c2.hashCode());
    }

    @Test public void dTrueOneObject() {
        D d1 = new D("1", 1);
        assertTrue(d1.hashCode() == d1.hashCode());
    }

    @Test public void dTrueTwoObjects() {
        D d1 = new D("1", 1);
        D d2 = new D("1", 1);
        assertTrue(d1.hashCode() == d2.hashCode());
    }        

    @Test public void dHashCodeFalse() {
        D d1 = new D("1", 1);
        D d2 = new D("2", 2);
        assertFalse(d1.hashCode() == d2.hashCode());
    }

    @Test public void cdHashCodeFalse() {
        C c1 = new C("1");
        D d1 = new D("1", 1);
        assertFalse(c1.hashCode() == d1.hashCode());
    }

    @Test public void doHashCodeFalse() {
        D d1 = new D("1", 1);
        Object o1 = new Object();
        assertFalse(d1.hashCode() == o1.hashCode());
    }

    @Test public void coHashCodeFalse() {
        C c1 = new C("1");
        Object o1 = new Object();
        assertFalse(c1.hashCode() == o1.hashCode());
    }

    @Test public void objectHashCodeTrue() { 
        Object o1 = new Object();
        assertTrue(o1.hashCode() == o1.hashCode());
    }

    @Test public void objectHashCodeFalse() {
        Object o1 = new Object();
        Object o2 = new Object();
        assertFalse(o1.hashCode() == o2.hashCode());                
    }    
}
