class Solution {
    public void traverse(List<Integer> res,Node node)
    {
       if(node==null) return;
       for(Node tmp:node.children)
         traverse(res,tmp);
       res.add(node.val);  
    }
    public List<Integer> postorder(Node root) {
       List<Integer> res=new ArrayList<>();
       traverse(res,root);
       return res; 
    }
}