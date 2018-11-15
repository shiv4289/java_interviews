package datastructures.trees;


/**
 * Created by admin on 06/06/17.
 */
public class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}
