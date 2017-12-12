
public class MaxDepth {
	public int maxDepth(TreeNode A) {
        if(A==null){
            return 0;
        }
        else{
            int left = maxDepth(A.left);
            int right = maxDepth(A.right);
            if(left>right){
                return left+1;
            }
            else{
                return right+1;
            }
        }
    }
}
