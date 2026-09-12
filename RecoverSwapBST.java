package Demo;
public class RecoverSwapBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node first = null;
    static Node second = null;
    static Node prev = null;

    // Find the two swapped nodes
    static void recover(Node root) {

        if (root == null) {
            return;
        }

        recover(root.left);

        // Find wrong order
        if (prev != null && prev.data > root.data) {

            if (first == null) {
                first = prev;
            }

            second = root;
        }

        prev = root;

        recover(root.right);
    }

    // Inorder traversal
    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        // BST with 30 and 60 swapped
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(60);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(70);
        root.right.right = new Node(80);

        System.out.println("Before Recovery:");
        inorder(root);

        // Find swapped nodes
        recover(root);

        // Swap their values back
        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        System.out.println();

        System.out.println("After Recovery:");
        inorder(root);
    }
}

