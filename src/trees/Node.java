package trees;

public class Node {
	
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		if (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE) {
			return;
		}
		if (value <= data) {
			if (left == null) {
				left = new Node(data);
			}
			else {
				left.insert(value);
			}
		}
		else {
			if (right == null) {
				right = new Node(value);
			}
			else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if (value == data) {
			return true;
		}
		else if (value < data) {
			if (left == null) return false;
			else {
				return left.contains(value);
			}
		}
		else {
			if (right == null) return false;
			else {
				return right.contains(value);
			}
		}
	}
	
	public void printInOrder() {
		
		if (left != null) {
			left.printInOrder();
		}
		System.out.println(data);   //reached as far left as possible
		
		if (right != null) {
			right.printInOrder();
		}
				
	}
	
	public void printPreOrder() {
		
		System.out.println(data);
		if (left != null) {
			left.printPreOrder();
		}
		if (right != null) {
			right.printPreOrder();
		}
		
	}
	
	public void printPostOrder() {
		
		if (left != null) {
			left.printPreOrder();
		}
		
		if (right != null) {
			right.printPreOrder();
		}
		System.out.println(data);
	}
	
	
}
