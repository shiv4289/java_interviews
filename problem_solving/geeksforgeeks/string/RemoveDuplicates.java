package geeksforgeeks.string;

/**
 * Created by sourabh on 15/6/16.
 */
public class RemoveDuplicates {

    public static String removeDuplicates(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                s = reduce(s);
                size = s.length();
                if (i > 0) {
                    --i;
                }
            }
        }
        return s;
    }

    public static String reduce(String s) {
        int i = 0;
        for (i = 0; i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1); i++) ;
        return s.substring(i);
    }


}
