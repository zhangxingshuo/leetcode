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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int numNodes = 1;
        
        while (!q.isEmpty()) {
            int newNumNodes = 0;
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < numNodes; i++) {
                Node curr = q.poll();
                for (Node child : curr.children) {
                    q.add(child);
                }
                newNumNodes += curr.children.size();
                temp.add(curr.val);
            }
            result.add(temp);
            numNodes = newNumNodes;
        }
        
        return result;
    }
}