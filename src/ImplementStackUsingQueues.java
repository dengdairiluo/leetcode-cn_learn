import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-15 17:04
 */
public class ImplementStackUsingQueues {

    private Queue<Integer> data;
    private Queue<Integer> help;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        data = new LinkedList<>();
        help = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        data.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (data.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        while (data.size() != 1) {
            help.add(data.poll());
        }
        int res = data.poll();
        swap();
        return res;
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (data.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        while (data.size() != 1) {
            help.add(data.poll());
        }
        int res = data.poll();
        help.add(res);
        swap();
        return res;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return data.size() == 0;
    }

    private void swap() {
        Queue<Integer> temp = help;
        help = data;
        data = temp;
    }
}
