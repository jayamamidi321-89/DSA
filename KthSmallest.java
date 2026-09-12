package Demo;

import java.util.PriorityQueue;

public class KthSmallest {
	static int findKthSmallestt(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap = 
				new PriorityQueue<>(
						(a, b) -> Integer.compare(b, a)
						);
		for(int num : arr) {
				maxHeap.offer(num);
				if(maxHeap.size() > k) {
					maxHeap.poll();
				}
					
				}
		return maxHeap.peek();
	}
	public static void main(String[] args) {
		int[] arr = {10, 5, 20, 8, 15, 30};
		System.out.println(findKthSmallestt(arr, 3));
	}
		
	}
		
