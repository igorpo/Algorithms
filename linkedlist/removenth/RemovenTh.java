package linkedlist.removenth;

// Solution:
// use two pointers
// 1. first move p2 to the nth node
// 2. then increment each ptr by 1 until p2 is at the tail
// 3. p1 will then be at the (size - n)th spot 
// 4. delete it
public class RemovenTh {
	
	class Node {
		int x;
		Node next;
		public Node(int x) {
			this.x = x;
			this.next = null;
		}
	}
	
	// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null, [2]
	// p1        p2
	// 
	// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
	//                p1        p2 
	public Node removeNthFromEnd(Node head, int n) {
		if (head == null || n <= 0) {
            return null;
        }
        
        Node p1 = head;
        Node p2 = head;
        
        // single node
        if (p1.next == null) {
            return null;
        }
        
        // move pointer up
        for (int i = 0; i < n; i++) {
            p2 = p2.next;
        }
        
        // p2 @ tail of LL (removing head) p2 would be null
        if (p2 == null) {
            head = head.next;
            return head;
        }
        
        // move p1 to left of p2
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        // p1 is now before the node that needs to be replaced
        p1.next = p1.next.next;
        return head;
	}
}
