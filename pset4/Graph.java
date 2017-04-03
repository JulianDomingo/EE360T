/*
 * Julian Domingo : jad5348
 */

// package pset4;

import java.util.*;

// Class Invariant: Fields "nodes" and "edges" are non-null;
//                  "this" graph has no node that is not in "nodes"
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
        if (!edges.containsKey(from)) {
            edges.put(from, new ArrayList<Integer>(Arrays.asList(to)));
        }
        else if (!edges.get(from).contains(to)) {
            edges.get(from).add(to);;
        }
    }

    public boolean unreachable(Set<Integer> sources, Set<Integer> targets) {
        if (sources == null || targets == null) {
            throw new IllegalArgumentException();
        }
    
    }





}
