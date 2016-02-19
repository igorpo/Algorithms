package trees.bstiterator;

import java.util.Stack;


public class BSTIterator {
	
	class TreeNode {
		
		public int val;
		public TreeNode left, right;
		
		public TreeNode(int val) {
			this.val = val;
		    this.left = this.right = null;
		}
	}
	
	private Stack<TreeNode> stack;
    private TreeNode curr;
    
    //@param root: The root of binary tree.
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        curr = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        return curr != null || !stack.isEmpty();
    }
    
    //@return: return next node
    public TreeNode next() {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        curr = stack.pop();
        TreeNode next = curr;
        curr = curr.right;
        return next;
    }
}
