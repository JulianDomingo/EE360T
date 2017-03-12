/*  Julian Domingo : jad5348 */

package pset2;

public class D extends C {
    int g;

    public D(String s, int g) {
        super(s);
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof D &&
           (this.s.equals(((D) o).s) &&
           (this.g == ((D) o).g)))
        {
            return true;            
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 10 + g;
        hash = hash * 15 + (s == null ? 0 : s.hashCode());
        return hash;
    }
}
