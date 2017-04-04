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
        addNode(from);
        addNode(to);
        
        if (!edges.containsKey(from)) {
            edges.put(from, new ArrayList<Integer>(Arrays.asList(to)));
        }
        else if (!edges.get(from).contains(to)) {
            edges.get(from).add(to);
        }

        initializeOutgoingEdgesFrom(to);        
    }

    private void initializeOutgoingEdgesFrom(int node) {
        if (!edges.get(node) == null) {
            edges.put(node, new ArrayList<Integer>());
        }
    }        

    public boolean unreachable(Set<Integer> sources, Set<Integer> targets) {
        if (sources == null || targets == null) {
            throw new IllegalArgumentException();
        }
        if (isSubsetOfGraphVertexSet(sources) &&
            isSubsetOfGraphVertexSet(targets) &&
            !hasDirectedPathsFrom(sources, targets))
        {
            return true;
        } 

        return false; 
    }

    private boolean isSubsetOfGraphVertexSet(Set<Integer> set) {
        for (int node : set) {
            if (!nodes.contains(node)) {
                return false;
            }
        }
        return true;
    }
          
    private boolean hasDirectedPathsFrom(Set<Integer> sources, Set<Integer> targets) {
        for (int source : sources) {
            for (int target : targets) {
                if (hasDirectedPath(source, target)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean hasDirectedPath(int source, int target) {
        if (source == target) { return true; }

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(source);

        while (!queue.isEmpty()) {
            int popped = queue.poll();
            if (popped == target) { return true; } 
            
            for (int adjacent : edges.get(popped)) {
                queue.add(adjacent);
            }
        }    
        
        return false;        
    }
}
