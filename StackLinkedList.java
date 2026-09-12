package Demo;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    // Push
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    int pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek
    int peek() {
        if (top == null) {
            return -1;
        }

        return top.data;
    }

    // Main method
    public static void main(String[] args) {

        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }
}