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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // we may require two ds 
        //one for travewrsing - queue and insertion deletion
        //one for storing 2 list one main list and otheer small list
        List<List<Integer>> mainlist=new ArrayList<>();
       
        
        //q -> offer, poll, peek
        // firstly add our root to the q
        if(root ==null)
        {
            return mainlist;
        }
        else
        {
            helper(root,mainlist);
            return mainlist;
        }
        
    }

     public void helper(TreeNode root,List<List<Integer>> mainlist)
     {
        Queue<TreeNode> q=new LinkedList<>();
        //remember we need to traverse all the elements of q levelwise so we need to iterate that untill q.size
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> sublist=new ArrayList<>();
              int sizeofq=q.size();
              for(int i=0;i<sizeofq;i++)//to keep all level child nodes at alevel and next level at next level
              {
              if(q.peek().left!=null) q.offer(q.peek().left);
              if(q.peek().right!=null) q.offer(q.peek().right);
              sublist.add(q.poll().val);
              }
              mainlist.add(sublist);
        }
       
     }
}