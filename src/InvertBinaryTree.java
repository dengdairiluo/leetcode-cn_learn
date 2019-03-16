import base.TreeNode;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-16 14:59
 */
public class InvertBinaryTree {

    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode oldLeft = root.left;
        root.left = invertTree1(root.right);
        root.right = invertTree1(oldLeft);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            TreeNode oldLeft = cur.left;
            cur.left = cur.right;
            cur.right = oldLeft;
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        return root;
    }
}
