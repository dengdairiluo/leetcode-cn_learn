/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-20 22:50
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] charS = s.toCharArray();
        int sumS = 0;
        for (char cs : charS) {
            sumS += cs;
        }

        char[] charT = t.toCharArray();
        int sumT = 0;
        for (char cT : charT) {
            sumT += cT;
        }

        return (char) (sumT - sumS);
    }
}
