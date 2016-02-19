package graph.routeexists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Route {
	
	class Node {
		private int label;
		ArrayList<Node> neighbors;
		
		public Node(int label) {
			this.label = label;
			this.neighbors = new ArrayList<Node>();
		}
		public void changeLabel(int l) {
			this.label = l;
		}
		
		public int getLabel() {
			return label;
		}
		public void add(Node s) {
			this.neighbors.add(s);
		}
	}
	
	/**
     * @param graph: A list of Directed graph node
     * @param s: the starting Directed graph node
     * @param t: the terminal Directed graph node
     * @return: a boolean value
     */
    public boolean hasRoute(ArrayList<Node> graph, 
                            Node s, Node t) {
        if (s == t) {
            return true;
        }
        if (graph == null || graph.size() == 0 || s == null || t == null) {
            return false;
        }
        
        HashSet<Node> visited = new HashSet<Node>();
        Stack<Node> stack = new Stack<Node>();
        stack.push(s);
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            if (!visited.contains(n)) {
                if (n == t) {
                    return true;
                }
                visited.add(n);
                for (Node g : n.neighbors) {
                    stack.push(g);
                }
            }
        }
        return false;
    }
}
