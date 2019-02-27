import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-27 19:29
 */
public class BracketsMatch {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        Stack<Character> matcher = new Stack<>();
        for (char c : chars) {
            if (matcher.size() == 0) {
                matcher.push(c);
            } else if (isMatch(matcher.peek(), c)) {
                matcher.pop();
            } else {
                matcher.push(c);
            }
        }
        return matcher.size() == 0;
    }


    private boolean isMatch(char l, char r) {
        if ((l == '(' && r == ')') ||
                        (l == '[' && r == ']') ||
                        (l == '{' && r == '}')) {
            return true;
        } else {
            return false;
        }
    }
}
