package linkedlist.DLL;

public class DLinkedList {
	
	private Node head;
	private Node tail;
	private int s = 0; // empty at first
	
	public DLinkedList() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		return s;
	}
	
	public void insert(String key) {
		
		// make node obj for key
		Node n = new Node(key);
		s++;
		// inserting into empty list
		// head is also tail
		if (isEmpty()) {
			head = n;
		} else {
			tail.setNext(n);
			n.setPrev(tail);
		}
		tail = n;
	}
	
	public Node delete(String key) {
		if (isEmpty()) {
			System.out.println("Error: Cannot delete from empty list!");
			return null;
		}
		Node curr = head;
		while (!curr.getData().equals(key)) {
			curr = curr.getNext();
			if (curr == null) {
				System.out.println("Element not in list!");
				return null;
			}
		}
		s--; // decrease size
		// found at head of list
		if (curr == head) {
			head = curr.getNext();
		} else {
			curr.getPrev().setNext(curr.getNext());
		}
		
		// found at tail
		if (curr == tail) {
			tail = curr.getPrev();
		} else {
			curr.getNext().setPrev(curr.getPrev());
		}
		return curr;
	}
	
	public boolean search(String key) {
		Node curr = head;
		while (!curr.getData().equals(key)) {
			curr = curr.getNext();
			// did not find it
			if (curr == null) {
				return false;
			}
		}
		return true;
	}
	
	public void sort() {
		Node curr = head;
		Node tmp = new Node("");
		boolean isAltered = true;
		while (isAltered) {
			isAltered = false;
			for (int i = 0; i < size() - 1; i++) {
				if (curr.getNext() == null) break; // list ended
				if (curr.getData().compareToIgnoreCase(curr.getNext().getData()) > 0) {
		            tmp.setData(curr.getData());
		            curr.setData(curr.getNext().getData());
		            curr.getNext().setData(tmp.getData());
		            isAltered = true;
				}
				curr = curr.getNext();
			}
		}
	}
	
	public void printList() {
		Node tmp = head;
		System.out.print(" (head) <---> ");
		while (tmp != null) {
			System.out.print(tmp.getData() + " <---> ");
			tmp = tmp.getNext();
		}
		System.out.print(" (tail) ");
	}
}

