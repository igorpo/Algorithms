package linkedlist.hascycle;

public class Cycle {
	
	class Node {
		int val;
		Node next;
		public Node(int x) {
			this.val = x;
			this.next = null;
		}
	}
	
	public boolean hasCycle(Node head) {  
        if (head == null) {
            return false;
        }
        Node runner = head;
        Node speedRacer = head.next;
        
        while (speedRacer != null && speedRacer.next != null) {
            
            if (runner.val == speedRacer.val) {
                return true;
            }
            
            runner = runner.next;
            speedRacer = speedRacer.next.next;
        }
        
        return false;
    }
}
