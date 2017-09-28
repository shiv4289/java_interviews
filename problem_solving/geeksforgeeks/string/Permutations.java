package geeksforgeeks.string;

/**
 * Created by sourabh on 15/6/16.
 */
public class Permutations {

    public static void permute(StringBuffer s, int index) {
        if (index >= s.length()) {
            System.out.println(s);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            s = swap(s, index, i);
            permute(s, index + 1);
            s = swap(s, index, i);
        }
    }

    public static StringBuffer swap(StringBuffer s, int i, int j) {
        Character c = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, c);
        return s;
    }
}
