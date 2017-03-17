/* Julian Domingo : jad5348 */

package pset2;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {

    /*
     * P5: If two objects are equal according to the equals(Object)
     * method, then calling the hashCode method on each of 
     * the two objects must produce the same integer result.
     */

    @Test public void cHashCodeTrue() {
        C c1 = new C("1");        
        assertTrue(c1.hashCode() == c1.hashCode());        
    }       

    @Test public void nHashCodeFalse() {
        C c1 = new C("1");
        C c2 = new C("2");
        assertFalse(c1.hashCode() == c2.hashCode());
    }

    @Test public void dHashCodeTrue() {
        D d1 = new D("1", 1);
        assertTrue(d1.hashCode() == d1.hashCode());
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

    @Test public void objectHashCodeFalse() {
        Object o1 = new Object();
        Object o2 = new Object();
        assertFalse(o1.hashCode() == o2.hashCode());                
    }    
}
