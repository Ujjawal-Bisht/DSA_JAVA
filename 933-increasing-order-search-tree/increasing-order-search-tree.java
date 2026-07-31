/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode ans ;
    public void Solve(TreeNode root){
        if(root == null) return ;

        Solve(root.left) ;
        ans.right = new TreeNode(root.val) ;
        ans = ans.right ;
        Solve(root.right) ;
    }
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null ;
        TreeNode dummy = new TreeNode(-1) ;
        ans = dummy ;
        Solve(root) ;
        return dummy.right ;
    }
}