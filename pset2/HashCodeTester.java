/* Julian Domingo : jad5348 */

package pset2;

import static.org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {

    /*
     * P5: If two objects are equal according to the equals(Object)
     * method, then calling the hashCode method on each of 
     * the two objects must produce the same integer result.
     */

    @Test public void cHashCode() {
        C c1 = new C("1");
        C c2 = new C("2");
        
        if (c1.equals(c2)) {
            assertTrue(c1.hashCode() == c2.hashCode());
        }
    }       

    @Test public void dHashCode() {
        D d1 = new D("1", 1);
        D d2 = new D("1", 2);
        
        if (d1.equals(d2)) {
            assertTrue(d1.hashCode() == d2.hashCode());
        }
    }

    @Test public void objectHashCode() {
        Object o1 = new Object();
        Object o2 = new Object();

        if (o1.equals(o2)) {
            assertTrue(o1.hashCode() == o2.hashCode());
        }
    }    
}
