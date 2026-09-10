package Demo;

public class fibonacciSearch {
	static int fibonacciSearch(int[] arr, int target) {
		int fib2 = 0;
		int fib1 = 1;
		int fib = fib1 + fib2;
		while(fib < n) {
			fib2 = fib1;
			fib1 = fib2;
			fib = fib1 + fib2;
		}
		int offset = -1;
		while (fib > 1) {
			int i = Math.min(
					offset + fib2,
					n-1
					);
			if(arr[i] < target) {
				fib =fib1;
				fib1 = fib2;
				fib2 = fib - fib1;
				offset = i;
			}else if (arr[i] > target) {
				fib = fib2;
				fiib1 = fib1 - fib2;
			}
		}
	}

}
