package Demo;

import java.util.Stack;

public class IterativePostorder {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void postorder(Node root) {

        if (root == null) {
            return;
        }

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {

            Node temp = s1.pop();
            s2.push(temp);

            if (temp.left != null) {
                s1.push(temp.left);
            }

            if (temp.right != null) {
                s1.push(temp.right);
            }
        }

        while (!s2.isEmpty()) {
            System.out.print(s2.pop().data + " ");
        }
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

