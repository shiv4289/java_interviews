package geeksforgeeks.matrix;

/**
 * Created by sourabh on 16/6/16.
 */
public class PrintSpiral {

    public static void printSpiral(Integer[][] M, Integer Rows, Integer Cols) {
        Integer LastRow = Rows - 1,
                LastColumn = Cols - 1,
                FirstRow = 0,
                FirstColumn = 0;
        while (FirstRow <= LastRow && FirstColumn <= LastColumn) {

            for (int i = FirstColumn; i <= LastColumn; i++) {
                System.out.println(M[FirstRow][i]);
            }
            FirstRow++;

            for (int i = FirstRow; i <= LastRow; i++) {
                System.out.println(M[i][LastColumn]);
            }
            LastColumn--;

            if (FirstRow <= LastRow && FirstColumn <= LastColumn) {
                for (int i = LastColumn; i >= FirstColumn; i--) {
                    System.out.println(M[LastRow][i]);
                }
                LastRow--;
            }

            if (FirstRow <= LastRow && FirstColumn <= LastColumn) {
                for (int i = LastRow; i >= FirstRow; i--) {
                    System.out.println(M[i][FirstColumn]);
                }
                FirstColumn++;
            }
        }
    }
}
