package linkedlist.DLL;


public class Node {
	
	private String key;
	private Node nxt = null;
	private Node prv = null;
	
	public Node(String key) {
		this.key = key;		
	}
	
	public void setNext(Node n) {
		nxt = n;
	}
	
	public void setPrev(Node n) {
		prv = n;
	}
	
	public void setData(String data) {
		key = data;
	}
	
	public String getData() {
		return key;
	}
	
	public Node getNext() {
		return nxt;
	}
	
	public Node getPrev() {
		return prv;
	}
}

