import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-11 16:38
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA;
        int lenA = 0;
        ListNode pb = headB;
        int lenB = 0;
        while (pa != null) {
            pa = pa.next;
            lenA++;
        }
        while (pb != null) {
            pb = pb.next;
            lenB++;
        }

        pa = headA;
        pb = headB;
        if (lenA > lenB) {
            int len = lenA - lenB;
            for (int i = 0; i < len; i++) {
                pa = pa.next;
            }
        } else {
            int len = lenB - lenA;
            for (int i = 0; i < len; i++) {
                pb = pb.next;
            }
        }

        while (pa != null && pb != null) {
            if (pa == pb) {
                return pa;
            }
            pa = pa.next;
            pb = pb.next;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
