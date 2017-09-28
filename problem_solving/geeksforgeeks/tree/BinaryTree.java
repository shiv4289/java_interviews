package geeksforgeeks.tree;

import geeksforgeeks.arrays.Utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sourabh on 24/6/16.
 */
public class BinaryTree {
    public Node root;


    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {

    }

    public void printLeftView() {
        printLeftView(root, new Node(0), new Integer(1));
    }

    public void printLeftView(Node root, Node maxLevel, Integer level) {
        if (root == null) return;
        if (level > maxLevel.data) {
            maxLevel.data = level;
            System.out.println(root.data);
        }
        printLeftView(root.left, maxLevel, level + 1);
        printLeftView(root.right, maxLevel, level + 1);

    }

    public void maxSum() {
        System.out.println(maxSum(root));
    }

    public Integer maxSum(Node root) {
        if (root == null) return 0;
        return root.data + Utils.max(maxSum(root.left), maxSum(root.right));
    }

    public void daimeter() {
        System.out.println(daimeter(root, new Node(0)));
    }

    public Integer daimeter(Node root, Node height) {
        if (root == null) {
            height.data = 0;
            return 0;
        }
        Node lh = new Node(0), rh = new Node(0);
        Integer dl = daimeter(root.left, lh);
        Integer dr = daimeter(root.right, rh);
        height.data = 1 + Utils.max(lh.data, rh.data);
        return Utils.max(dl, dr, 1 + lh.data + rh.data);
    }

    public void levelOrderTraversal() {
        levelOrderTraversal(root);
    }

    public void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node t = q.poll();
            System.out.println(t.data);
            if (t.left != null) q.add(t.left);
            if (t.right != null) q.add(t.right);
        }
    }

    public void printPaths() {
        printPaths(root, new LinkedList<Integer>());
    }

    public void printPaths(Node root, LinkedList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(path);
        }
        printPaths(root.left, path);
        printPaths(root.right, path);
        path.pollLast();
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    public void preorderTraversal(Node r) {
        if (r == null) return;
        System.out.println(r.data);
        preorderTraversal(r.left);
        preorderTraversal(r.right);

    }

    public void inorderTraversal(Node r) {
        if (r == null) return;
        inorderTraversal(r.left);
        System.out.println(r.data);
        inorderTraversal(r.right);
    }

    public void postorderTraversal(Node r) {
        if (r == null) return;
        postorderTraversal(r.left);
        postorderTraversal(r.right);
        System.out.println(r.data);
    }


}
