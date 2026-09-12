
package Demo;

public class MinHeap {

    private int[] heap;
    private int size;

    MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    // Insert
    void insert(int value) {

        if (size == heap.length) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;
        int current = size;
        size++;

        // Heapify Up
        while (current > 0) {

            int parent = (current - 1) / 2;

            if (heap[parent] <= heap[current]) {
                break;
            }

            // Swap
            int temp = heap[parent];
            heap[parent] = heap[current];
            heap[current] = temp;

            current = parent;
        }
    }

    // Remove minimum element
    int removeMin() {

        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int min = heap[0];

        heap[0] = heap[size - 1];
        size--;

        // Heapify Down
        int current = 0;

        while (true) {

            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int smallest = current;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest == current) {
                break;
            }

            // Swap
            int temp = heap[current];
            heap[current] = heap[smallest];
            heap[smallest] = temp;

            current = smallest;
        }

        return min;
    }

    // Display heap
    void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        MinHeap h = new MinHeap(10);

        h.insert(30);
        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(15);

        System.out.println("Min Heap:");
        h.display();

        System.out.println("Minimum: " + h.removeMin());

        System.out.println("After removing minimum:");
        h.display();
    }
}


