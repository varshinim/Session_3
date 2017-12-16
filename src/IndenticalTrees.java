

import java.util.Stack;

public class IndenticalTrees {
	public int isSameTree(TreeNode A, TreeNode B) {
        Stack<TreeNode> a = new Stack<TreeNode>();       
	    Stack<TreeNode> b = new Stack<TreeNode>();
	    if(A != null){
	        a.push(A) ;
	    } 
	    if (B != null){
	        b.push(B) ; 
	    }
	    while (!a.isEmpty() && !b.isEmpty()) {
	    	 TreeNode nodeA = a.pop() ;
	    	 TreeNode nodeB = b.pop() ;	    	
	    	 if (nodeA.val != nodeB.val) return 0 ;
	    	 if (nodeA.right != null) a.push(nodeA.right) ;
	    	 if (nodeB.right != null) b.push(nodeB.right) ;
	    	 if (a.size() != b.size()) return 0 ;
	    	 if (nodeA.left != null) a.push(nodeA.left) ;	    	 	    	 
	    	 if (nodeB.left != null) b.push(nodeB.left) ;
	    	 if (a.size() != b.size()) return 0 ;
	     }		     
	     return 1;	
    }
}
