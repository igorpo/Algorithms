package graph.topsort;

import java.util.ArrayList;
import java.util.HashSet;

public class TopologicalSort {
	
	class Node {
		int x;
		ArrayList<Node> neighbors;
		public Node(int x) {
			this.x = x;
			this.neighbors = new ArrayList<Node>();
		}

	}
	
	/**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */    
    public ArrayList<Node> topSort(ArrayList<Node> graph) {
        ArrayList<Node> topSortedList = new ArrayList<Node>();
        HashSet<Node> marked = new HashSet<Node>();
        HashSet<Node> tempMarked = new HashSet<Node>();
        
        for (Node g : graph) {
            dfs(marked, tempMarked, g, topSortedList);
        }
        return topSortedList;
    }
    
    private void dfs(HashSet<Node> marked, HashSet<Node> tempMarked, Node n, ArrayList<Node> topSortedList) {
        
        // fully marked vs temporarily marked
        if (tempMarked.contains(n)) {
            if (marked.contains(n)) {
                return;
            }
            // we have hit a cycle 
            throw new IllegalStateException("Cycle found! Invalid.");
        }
        
        tempMarked.add(n);
        
        for (Node f : n.neighbors) {
            dfs(marked, tempMarked, f, topSortedList);
        }
        
        marked.add(n);
        
        // add to head of list
        topSortedList.add(0, n);
        
    }
}
