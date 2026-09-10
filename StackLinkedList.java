package Demo;

public class StackLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	private Node top;
	void Push(int value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
	}
	int pop() {
		if(top == null) {
			System.out.prinln("Stack underflow");
			return-1;
		}
		int value = top.data;
		top = top.next;
		return value;
	}
	if(top == null) {
		return-1;
	}
	return tp.data;
}
boolean isEmpty() {
	return top == null;
}
public static void main(String[] args) {
	StackLinkedList stack = new StackLinkedList();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	System.out.prinln(stack.peek());
	System.out.prinln(stack.pop())
	System.out.prinln(stack.pop())
}
}
		
	}

}
