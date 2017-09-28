package geeksforgeeks.matrix;

import java.util.PriorityQueue;

/**
 * Created by sourabh on 16/6/16.
 */

public class KthSmallest {

    public static Integer smallest(Integer M[][], Integer Rows, Integer Cols) {
        PriorityQueue<YoungPair> pq = new PriorityQueue<YoungPair>();
        for (int i = 0; i < Rows; i++) {
            pq.add(new YoungPair(M[i][0], i, 0));
        }
        for (int k = 0; k < Rows * Cols; k++) {
            YoungPair yp = pq.poll();
            System.out.println(yp.value);
            if (yp.y + 1 < Cols) {
                pq.add(new YoungPair(M[yp.x][yp.y + 1], yp.x, yp.y + 1));
            }
        }
        return 0;
    }
}
