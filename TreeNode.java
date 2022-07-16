class Solution {
    public boolean checkTree(TreeNode root) {
        Boolean result = false;
        int rootValue = root.val;
        int leftLeafValue = root.left.val;
        int rightLeafValue = root.right.val;
        if (rootValue == (leftLeafValue + rightLeafValue)) {
            result = true;
        }
        return result;
    }
}

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
