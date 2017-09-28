package geeksforgeeks.dynamic;

/**
 * Created by sourabh on 2/8/16.
 */
public class UglyNumbers {


    public static void compute() {
        int mul[] = {2, 3, 5, 2 * 3, 2 * 5, 3 * 5, 2 * 3 * 5};
        Set s = new HashSet<>();
        for (int i = 1, k = 1; i < 100; i++) {
            for (int j = 0; j < mul.length; j++) {
                if (k > 150) break;
                s.add(i * mul[j]);
            }
        }
    }

    public static void main(String args[]) {
        compute();
    }
}
