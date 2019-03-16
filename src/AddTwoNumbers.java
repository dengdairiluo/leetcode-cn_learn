import base.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-19 11:02
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;
        int up = 0;
        while (p != null || q != null) {
            int m = (p != null ? p.val : 0);
            int n = (q != null ? q.val : 0);
            int sum = m + n + up;
            up = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (up > 0) {
            curr.next = new ListNode(up);
        }
        return result.next;
    }





}
