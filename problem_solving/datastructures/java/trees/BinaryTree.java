package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    void inorder() {
        inorder(this.root);
        System.out.println("");
    }

    void preorder() {
        preorder(this.root);
        System.out.println("");
    }

    void postorder() {

        postorder(this.root);
        System.out.println("");
    }

    void levelorder() {
        levelorder(this.root);
        System.out.println("");
    }

    int size() {

        return size(this.root);
    }

    int height() {

        return height(this.root);
    }

    Node mirror() {

        return mirror(this.root);
    }

    void paths() {

        paths(this.root, new LinkedList<Integer>());
    }

    int diameter() {

        return diameter(this.root, new Pair());
    }

    int countLeaves() {
        return countLeaves(this.root);
    }

    /**
     * Implementations
     */

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print("->" + node.value);
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) return;
        System.out.print("->" + node.value);
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print("->" + node.value);
    }

    public void levelorder(Node node) {
        if (node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current != null) {
                System.out.print("->" + current.value);
                queue.add(current.left);
                queue.add(current.right);
            }

        }
    }

    int size(Node node) {
        if (node == null) return 0;
        return 1 + size(node.left) + size(node.right);
    }

    int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));

    }

    Node mirror(Node node) {
        if (node == null) return null;
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        node.right = left;
        node.left = right;
        return node;
    }

    void paths(Node node, LinkedList<Integer> path) {
        if (node == null)
            return;
        path.addLast(node.value);
        if (node.left == null & node.right == null)
            System.out.println(path.toString());
        paths(node.left, path);
        paths(node.right, path);
        path.pollLast();
    }

    int diameter(Node node, Pair height) {
        if (node == null) {
            height.first = 0;
            return 0;
        }
        Pair lheight = new Pair();
        Pair rheight = new Pair();
        Integer ldiameter = diameter(node.left, lheight);
        Integer rdiameter = diameter(node.right, rheight);
        height.first = 1 + Math.max(lheight.first, rheight.first);
        return Math.max(Math.max(ldiameter, rdiameter), 1 + lheight.first + rheight.first);
    }

    Node lca(Node node, Integer value1, Integer value2) {
        if (node == null)
            return null;

        if (node.value > value1 && node.value > value2)
            return lca(node.left, value1, value2);

        if (node.value < value1 && node.value < value2)
            return lca(node.right, value1, value2);

        return node;
    }

    int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }


    class Pair {
        Integer first;
        Integer second;

        Pair() {
            first = second = 0;
        }
    }
}
