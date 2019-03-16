import base.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-09 11:12
 */
public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        int depth = getDepth(root);
        if (depth == -1) {
            return false;
        }
        return true;
    }

    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        if (leftDepth == -1 || rightDepth == -1) {
            return -1;
        }

        if (leftDepth - rightDepth > 1 || rightDepth - leftDepth > 1) {
            return -1;
        }

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}
