
public class Balanced {
	public int isBalanced(TreeNode A) {
        int ans = height(A);
        if(ans!=-1){
            return 1;
        }
        return 0;
    }
    public int height(TreeNode A){
        if(A==null){
            return 0;
        }
        int left = height(A.left);
        if(left == -1){
            return -1;
        }
        int right = height(A.right);
        if(right == -1){
            return -1;
        }
        if(Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}
