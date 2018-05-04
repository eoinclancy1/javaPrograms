package graphSearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
	
	private Node getNode(int id) {
		return nodeLookup.get(id);
	}
	
	public void addEdge(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		
		s.adjacent.add(d);
	}
	
	public boolean hasPathDFS (int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s, d, visited);
	}
	
	private boolean hasPathDFS (Node source, Node destination, HashSet<Integer> visited) {
		
		if (visited.contains(source.getId())) {
			return false; 
		}
		
		visited.add(source.getId());
		
		if (source == destination) {
			return true;
		}
		
		for (Node child : source.adjacent) {
			if (hasPathDFS(child, destination, visited)){
				return true;
			}
		}
		
		return false;
		
	}
	
	
	
	public boolean hasPathBFS (int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		
		return hasPathBFS(s, d);
	}
	
	private boolean hasPathBFS (Node source, Node destination) {
		
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		nextToVisit.add(source);
		
		while(!nextToVisit.isEmpty()) {
			
			Node node = nextToVisit.remove();
			if (node == destination) {
				return true;
			}
			
			if (visited.contains(node.getId())) {
				continue;
			}
			else {
				visited.add(node.getId());
			}
			
			for (Node child : node.adjacent) {
				nextToVisit.add(child);
			}
			
			
		}
		
		return false;
		
		
		
	}
	
	
	
}
