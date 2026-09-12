package Demo;

public class NthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Add node
    static void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Find Nth node from end
    static void nthNodeFromEnd(int n) {

        Node first = head;
        Node second = head;

        // Move first pointer n positions
        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("Invalid n");
                return;
            }
            first = first.next;
        }

        // Move both pointers
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println("Nth node from end = " + second.data);
    }

    public static void main(String[] args) {

        add(10);
        add(20);
        add(30);
        add(40);
        add(50);

        int n = 2;

        nthNodeFromEnd(n);
    }
}

