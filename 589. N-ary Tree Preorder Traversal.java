/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        
        if (root == null) return result;
        
        Stack<Node> s = new Stack<>();
        s.add(root);
        
        while (!s.isEmpty()) {
            Node curr = s.pop();
            result.add(curr.val);
            for (int i = curr.children.size() - 1; i >= 0; i--) {
                s.add(curr.children.get(i));
            }
        }
        
        return result;
    }
}