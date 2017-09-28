package geeksforgeeks.tree;

/**
 * Created by sourabh on 24/6/16.
 */
public class Node {
    Integer data;
    public Node left;
    public Node right;

    public Node(int v) {
        this.data = v;
        left = right = null;

    }
}
