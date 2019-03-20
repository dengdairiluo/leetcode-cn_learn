/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-18 17:10
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            swap(s, i, j);
            i++;
            j--;
        }
    }

    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
