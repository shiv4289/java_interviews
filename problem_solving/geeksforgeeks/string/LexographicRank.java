package geeksforgeeks.string;

import java.util.Arrays;

/**
 * Created by sourabh on 15/6/16.
 */
public class LexographicRank {

    public static int Rank(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            String sorted = getSortedString(s.substring(i));
            value = value + sorted.indexOf(s.charAt(i)) * factorial(s.length() - i - 1);
        }
        return value;
    }

    public static int factorial(int n) {
        if (n < 2) return 1;
        return n * factorial(n - 1);
    }

    public static String getSortedString(String s) {
        char[] characters = s.toCharArray();
        Arrays.sort(characters);
        return String.valueOf(characters);
    }
}
