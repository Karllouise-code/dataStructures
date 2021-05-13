class Node {
    int data;
    Node left, right;

    //*CONSTRUCTOR
    Node(int key) {
        data = key;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        //*Traverse root
        System.out.print(node.data + " ");
        //*Traverse left
        preOrder(node.left);
        //*Traverse right
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        //*Traverse left
        postOrder(node.left);
        //*Traverse right
        postOrder(node.right);
        //*Traverse root
        System.out.print(node.data + " ");
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        //*Traverse left
        inOrder(node.left);
        //*Traverse root
        System.out.print(node.data + " ");
        //*Traverse right
        inOrder(node.right);
    }

}
