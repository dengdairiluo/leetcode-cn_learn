import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-11 15:17
 */
public class MinStack {

    private int[] list;
    private int size;
    private int minNum = Integer.MAX_VALUE;


    /**
     * initialize your data structure here.
     */
    public MinStack() {
        list = new int[1000];
        size = 0;
    }

    public void push(int x) {
        if (size < 1000) {
            list[size++] = x;
            minNum = Math.min(minNum, x);
        }
    }

    public void pop() {
        if (size >= 1) {
            int topNum = list[size - 1];
                size--;
                if (minNum == topNum) {
                    findMin();
                }
        }
    }

    public int top() {
        return list[size - 1];

    }

    public int getMin() {
        return minNum;
    }

    private void findMin() {
        minNum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            minNum = Math.min(minNum, list[i]);
        }
    }
}
