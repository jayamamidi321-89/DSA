package Demo;

public class PostorderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void postorder(Node root) {

        // Base condition
        if (root == null) {
            return;
        }

        // 1. LEFT
        postorder(root.left);

        // 2. RIGHT
        postorder(root.right);

        // 3. ROOT
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        postorder(root);
    }
}


