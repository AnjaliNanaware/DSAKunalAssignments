
public class PathSum{

 //Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }



    public static boolean traverse(TreeNode root, int t,int sum){

        if(root==null){
            return false;
        }

        if(root.left==null && root.right==null) return (sum+root.val)==t;

        // sum+=root.val;
        boolean op1=traverse(root.left,t,sum+root.val);
       
        boolean op2=traverse(root.right,t,sum+root.val);

        return op1||op2;

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null) return false;
        return traverse(root,targetSum,0);
    }

}