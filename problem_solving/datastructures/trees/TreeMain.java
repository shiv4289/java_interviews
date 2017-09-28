package datastructures.trees;

/**
 * Created by admin on 06/06/17.
 */
public class TreeMain {

    public void execute() {
        BinaryTree tree = sample(0);
        tree.preorder();
        tree.inorder();
        tree.postorder();
        tree.levelorder();
        tree.mirror();
        tree.preorder();
        tree.paths();
        System.out.println(tree.size());
        System.out.println(tree.height());
        System.out.println(tree.diameter());
        System.out.println(tree.countLeaves());
    }

    BinaryTree sample(int type) {
        BinaryTree tree = new BinaryTree();
        switch (type) {
            default:
                tree.root = new Node(1);
                tree.root.left = new Node(2);
                tree.root.right = new Node(3);
                tree.root.left.left = new Node(4);
                tree.root.left.right = new Node(5);
        }
        return tree;
    }
}
