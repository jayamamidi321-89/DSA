package Demo;

public class Hello {
	static int LinearSearch(int[] arr, int target) {
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] == target) {
				return i;
				
			}
		}
		
	return -1;
	}
	public static void main(String[] args) {
		int[] arr = {10, 25, 7, 42, 18, 30};
		int target = 42;
		int result = LinearSearch(arr, target);
		if(result != -1)
			System.out.println("Found at index: " + result);
		else
			System.out.println(" Notfound");
		
	}

}
