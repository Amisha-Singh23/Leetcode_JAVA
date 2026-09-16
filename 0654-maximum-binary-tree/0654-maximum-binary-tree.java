class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Stack<TreeNode> stack = new Stack<>();

        for (int num : nums) {
            TreeNode curr = new TreeNode(num);

            while (!stack.isEmpty() && stack.peek().val < num) {
                curr.left = stack.pop();
            }

            if (!stack.isEmpty()) {
                stack.peek().right = curr;
            }

            stack.push(curr);
        }

        while (stack.size() > 1) {
            stack.pop();
        }

        return stack.peek();
    }
} 