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
    public List<Integer> inorderTraversal(TreeNode root) {
        /**
            아이디어
            1. 스택 사용 (부분 노드 스택에 넣기)
            2. 왼쪽부터 쭉 들어가면서 부분 노드를 스택에 쌓고, 나오면서 오른쪽 존재하면 들어가기
        */

        List<Integer> answerList = new ArrayList<>();
        Stack<TreeNode> tempStack = new Stack<>();
        TreeNode curr = root;

        while(curr != null || !tempStack.isEmpty()){
            while(curr != null){
                tempStack.push(curr);
                curr = curr.left;
            }
            curr = tempStack.pop();
            answerList.add(curr.val);
            curr = curr.right;
        }

        return answerList;

    }
}