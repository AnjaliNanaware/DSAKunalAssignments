
import java.util.ArrayList;
import java.util.List;


public class BTpaths{

//  Definition for a binary tree node.
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
 

    public static void helper(TreeNode root, List<String> ans, String path){

        //this will not make sure that the node is leaf node
        if(root==null) return; 

        path+=root.val;

        //This will make sure that node is leaf node 
        if(root.left==null && root.right==null){
            ans.add(path);
            return;
        }

        path+="->";
        helper(root.left,ans,path);
        helper(root.right,ans,path);



    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();

        helper(root,ans,"");

        return ans;
    }

}