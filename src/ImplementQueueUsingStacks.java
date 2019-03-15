import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-15 17:53
 */
public class ImplementQueueUsingStacks {

    private Stack<Integer> in;
    private Stack<Integer> out;
    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {
        in = new Stack<>();
        out = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
        in.push(x);
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (out.isEmpty()) {
            return -1;
        }
        return out.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (out.isEmpty()) {
            return -1;
        }
        return out.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return out.isEmpty();
    }
}
