package Demo;

class queueLinkedList {
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	private Node front;
	private Node rear;
	
	void enqueue (int value) {
		Node newNode = new Node(value);
		if(rear == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	int dequeue() {
		if(front == null) {
			return -1;
		}
		int value = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return value;
	}

}
	


