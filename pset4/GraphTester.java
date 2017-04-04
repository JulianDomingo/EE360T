/*
 * Julian Domingo : jad5348
 */

// package pset4;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class GraphTester {
    // addEdge() test cases.
    @Test public void tae0() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1]}");
    }
    
    @Test public void isDirectedGraph() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        assertFalse(g.toString().equals("nodes: [0, 1]\nedges: {1=[0]}")); 
    }

    @Test public void isUndirectedGraph() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        assertTrue(g.toString().equals("nodes: [0, 1]\nedges: {0=[1], 1=[0]}"));
    }
            
        
        
    // unreachable() test cases.
    @Test public void tr0() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new HashSet<Integer>();
        nodes.add(0);
        assertTrue(g.unreachable(new HashSet<Integer>(), nodes));
    }
    
}

