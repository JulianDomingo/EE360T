/*
 * Julian Domingo : jad5348
 */

// package pset4;

import java.util.*;

public class Graph {
    private Set<Integer> nodes;
    private Map<Integer, List<Integer>> edges;

    public Graph() {
        nodes = new HashSet<Integer>();
        edges = new HashMap<Integer, List<Integer>>();
    }

    public String toString() {
        return "nodes=" + nodes + "; " + "edges=" + edges;
    }

    public void addNode(int node) {
        nodes.add(node);
    }

    public void addEdge(int from, int to) {
        
    }

    public boolean unreachable(Set<Integer> sources, Set<Integer> targets) {
        if (sources == null || targets == null) {
            throw new IllegalArgumentException();
        }
    }





}
