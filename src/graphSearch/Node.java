package graphSearch;

import java.util.LinkedList;

public class Node {

	private int id;
	LinkedList<Node> adjacent = new LinkedList<Node>();
	
	public Node(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
}
