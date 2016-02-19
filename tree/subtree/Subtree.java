package tree.subtree;

public class Subtree {
	
	class TreeNode {
		  public int val;
		  public TreeNode left, right;
		  public TreeNode(int val) {
			  this.val = val;
		      this.left = this.right = null;
		  }
	}
	
	/**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if (T2 == null) {
            return true;
        }
        if (T1 == null) {
            return false;
        }
        
        return checkTree(T1, T2) || isSubtree(T1.right, T2) || isSubtree(T1.left, T2);
    }
    
    private boolean checkTree(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null) {
            return true;
        }
        if (T1 == null || T2 == null) {
            return false;
        }
        
        return (T1.val == T2.val) && checkTree(T1.right, T2.right) && checkTree(T1.left, T2.left);
    }
}
