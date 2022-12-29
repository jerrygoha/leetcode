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

    boolean answer = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        /**
            아이디어
            1. 트리 전체 순회하면서 동일여부 판단
            2. 재귀, 스택 사용가능
        */
        recCheckTree(p, q);
        return answer;
    }

    public void recCheckTree(TreeNode p, TreeNode q){
        if(p != null && q != null){
            //양쪽 노드나 null이 아닌경우 판단
            if(p.val != q.val){
                answer = false;
            }
            recCheckTree(p.left, q.left);
            recCheckTree(p.right, q.right);
        }else if (p == null && q == null){
            //양쪽 노드가 둘다 null로 가는 경우, 같으므로 따로 처리 안함
        }else{
            //양쪽 노드가 null 포함하여 다른 경우, 다르다고 판단
            answer = false;
        }
    }
}