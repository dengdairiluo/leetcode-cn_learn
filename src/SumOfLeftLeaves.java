import base.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-21 00:51
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.left != null &&
                root.left.left == null &&
                root.left.right == null) {
            res += root.left.val;
        }
        return sumOfLeftLeaves(root.left) +
                sumOfLeftLeaves(root.right) + res;
    }
}
