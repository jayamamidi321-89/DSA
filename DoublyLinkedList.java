package Demo;

public class DoublyLinkedList {

    // Node class
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Insert at the end
    void insertLast(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Connect new node with current tail
        tail.next = newNode;
        newNode.prev = tail;

        // Update tail
        tail = newNode;
    }

    // Display from beginning to end
    void displayForward() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ⇌ ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    // Display from end to beginning
    void displayBackward() {
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + " ⇌ ");
            current = current.prev;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();
    }
}