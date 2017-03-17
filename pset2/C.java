/* Julian Domingo : jad5348 */

package pset2;

public class C {
    String s;
    
    public C(String s) {
        this.s = s;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof C && this.s.equals(((C) o).s)) {
            return true;
        }        
        return false;
    }

    @Override 
    public int hashCode() {
        int hash = 1;
        hash = hash * 10 + (s == null ? 0 : s.hashCode());
        return hash;        
    } 
}
