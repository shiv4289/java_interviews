package geeksforgeeks.matrix;

/**
 * Created by sourabh on 16/6/16.
 */
class YoungPair implements Comparable {
    Integer value;
    Integer x;
    Integer y;

    public YoungPair(Integer value, Integer x, Integer y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        YoungPair yp = (YoungPair) o;
        return this.value.compareTo(yp.value);
    }
}
