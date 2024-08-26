class Solution {
    public void traverse(List<Integer> res, TreeNode node)
    {
        if(node==null) return;
        traverse(res,node.left);
        traverse(res,node.right);
        res.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> res=new ArrayList<>();
       traverse(res,root); 
       return res;
    }
}