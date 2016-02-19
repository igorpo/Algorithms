package linkedlist.reverse;

public class Reverse {
	
	private class Node {
		@SuppressWarnings("unused")
		private int val;
		Node next;
		
		@SuppressWarnings("unused")
		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node reversedHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reversedHead;
    }
}
