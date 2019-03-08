import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-08 18:29
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrder(LevelOrder.TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<LevelOrder.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count > 0) {
                LevelOrder.TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
            res.add(0, list);
        }
        return res;
    }

    public class TreeNode {
        int val;
        LevelOrder.TreeNode left;
        LevelOrder.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
