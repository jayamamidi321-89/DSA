package Demo;

public class CircularQueue {

    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    void enqueue(int value) {

        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    // Dequeue
    int dequeue() {

        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];

        front = (front + 1) % capacity;
        size--;

        return value;
    }

    // Peek
    int peek() {

        if (size == 0) {
            return -1;
        }

        return queue[front];
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Deleted: " + queue.dequeue());
        System.out.println("Deleted: " + queue.dequeue());

        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println("Front element: " + queue.peek());
    }
}
