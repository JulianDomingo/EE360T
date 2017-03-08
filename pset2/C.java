/*
 * Julian Domingo : jad5348
 */

package pset2;
public class C {
    String s;
    
    public C(String s) {
        this.s = s;
    }
    
    @Override
    public boolean equals(Object o) {
            // returns a boolean consistent with the Java contract for equals method;
            // // returns true if and only if o is an object of class
            // // C and has the same value for field s as this.s (w.r.t. String equals)
            // // your code goes here
            // }
            // @Override
            // public int hashCode() {
            // // returns an integer consistent with the Java contract for hashCode method;
            // // does not return a constant value
            // // your code goes here
            // }
            // }
    }
}

public class D extends C {
    int g;

    public D(String s, int g) {
        super(s);
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        // returns a boolean consistent with the Java contract for equals method
        // returns true if and only if o is an object of class D and
        // has the same value for field s as this.s (w.r.t. String equals) and
        // the same value for field g as this.g
        //
        // your code goes here
    }

    @Override
    public int hashCode() {
        // returns an integer consistent with the Java contract for hashCode method;
        // does not return a constant value
        //
        //
    }
}
