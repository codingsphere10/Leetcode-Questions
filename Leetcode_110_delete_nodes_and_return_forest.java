class Solution {
    public void deleteNodes(TreeNode node, TreeNode parent, boolean[] to_be_deleted,List<TreeNode> res)
    {
        if(to_be_deleted[node.val]==true)
        {
           if(node.left!=null && to_be_deleted[node.left.val]==false)
             res.add(node.left);
           if(node.right!=null && to_be_deleted[node.right.val]==false)
             res.add(node.right);
           if(parent!=null)
           {
             if(parent.left==node) parent.left=null;
             if(parent.right==node) parent.right=null;
           }   
        }
        if(node.left!=null)
          deleteNodes(node.left,node,to_be_deleted,res);
        if(node.right!=null)
          deleteNodes(node.right,node,to_be_deleted,res);
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
       boolean[] to_be_deleted=new boolean[1001];
       for(int n:to_delete)
           to_be_deleted[n]=true;

       List<TreeNode> res=new ArrayList<>(1000); 

       if(to_be_deleted[root.val]==false)
          res.add(root);

        deleteNodes(root,null,to_be_deleted,res);
        return res; 
    }
}