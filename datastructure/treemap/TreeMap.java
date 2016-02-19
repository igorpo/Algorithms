package datastructure.treemap;

public class TreeMap {
	
	private class Node {
		int key;
		int value;
		Node left, right;
		
		public Node(int key, int value) {
			this.key = key;
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	
	private int size = 0;
	private Node root;
	
	public TreeMap() {
		this.root = null;
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public int get(int key) {
		return getH(root, key);
	}
	
	private int getH(Node n, int key) {
		// does not exist
		if (n == null) {
			return new Integer(null);
		}
		
		if (key < n.key) {
			return getH(n.left, key);
		} else if (key > n.key) {
			return getH(n.right, key);
		} else {
			return n.value;
		}
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void put(int key, int value) {
		this.root = putH(root, key, value);
	}
	
	private Node putH(Node n, int key, int value) {
		// treemap empty or node does not exist
		if (n == null) {
			size++;
			return new Node(key, value);
		}
		
		if (key < n.key) {
			n.left = putH(n.left, key, value);
		} else if (key > n.key) {
			n.right = putH(n.right, key, value);
		} else {
			n.value = value;
		}
		return n;
	}
	
	/**
	 * Size
	 * @return number of key, val pairs
	 */
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(5, 5);
		t.put(1, 1);
		t.put(3, 3);
		t.put(3, 4);
		System.out.println(t.get(1));
		System.out.println(t.get(3));
		System.out.println(t.get(5));
		System.out.println("size: " + t.size());
	}
}

