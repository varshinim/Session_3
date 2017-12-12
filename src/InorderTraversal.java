import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
    val = x;
    left=null;
    right=null;
    }
  }
public class InorderTraversal {
	public int[] inorderTraversal(TreeNode A) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        TreeNode curr = A;
        if(A==null){
            return null;
        }
        while(curr!=null){
            st.push(curr);
            curr = curr.left;
        }
        while(!st.isEmpty()){
            curr = st.pop();
            list.add(curr.val);
            if(curr.right!=null){
                curr = curr.right;
                while(curr!=null){
                    st.push(curr);
                    curr = curr.left;
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
