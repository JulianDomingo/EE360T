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
   
    // My Test Cases:  
    @Test public void tae1() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        assertEquals(g.toString(), "nodes: [0, 1, 2]\nedges: {0=[1], 1=[2], 2=[]}");
    }

    @Test public void tae2() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2); 
        assertEquals(g.toString(), "nodes: [0, 1, 2]\nedges: {0=[1], 1=[], 2=[]}");
    }

    @Test public void tae3() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1], 1=[0]}");
    }

    @Test public void tae4() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        assertEquals(g.toString(), "nodes: [0, 1, 2, 3]\nedges: {0=[1], 1=[], 2=[3], 3=[]}");
    }    
            
/********************************************************************************************************/    

    // unreachable() test cases.
    @Test public void tr0() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new HashSet<Integer>();
        nodes.add(0);
        assertTrue(g.unreachable(new HashSet<Integer>(), nodes));
    }

    // My Test Cases:
    @Test public void tr1() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new HashSet<Integer>();
        nodes.add(1);
        assertTrue(g.unreachable(nodes, nodes));
    }

    @Test public void tr2() {
        Graph g = new Graph();
        g.addEdge(1, 2);
        Set<Integer> source = new HashSet<Integer>();
        Set<Integer> target = new HashSet<Integer>();
        source.add(1);
        target.add(2);
        assertFalse(g.unreachable(source, target));
    }

    @Test public void tr3() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        Set<Integer> source = new HashSet<Integer>();
        Set<Integer> target = new HashSet<Integer>();
        source.add(0);
        target.add(3);
        assertFalse(g.unreachable(source, target));
    }

    @Test public void tr4() {
        Graph g = new Graph();
        g.addEdge(0, 5);
        g.addEdge(10, 15);
        g.addEdge(20, 25);
        Set<Integer> source = new HashSet<Integer>();
        Set<Integer> target = new HashSet<Integer>();            
        source.add(0);
        target.add(25);            
        assertTrue(g.unreachable(source, target));
    }
           
    @Test public void tr5() {
        Graph g = new Graph();
        g.addEdge(0, 5);
        g.addEdge(5, 0);
        Set<Integer> source = new HashSet<Integer>();
        Set<Integer> target = new HashSet<Integer>();
        source.add(0);
        target.add(5);
        assertFalse(g.unreachable(source, target)); 
    }
    
    @Test public void tr6() {
        Graph g = new Graph();
        g.addEdge(0, 5);
        g.addEdge(5, 0);
        Set<Integer> source = new HashSet<Integer>();
        Set<Integer> target = new HashSet<Integer>();
        source.add(5);
        target.add(0);
        assertFalse(g.unreachable(source, target)); 
    }
}


