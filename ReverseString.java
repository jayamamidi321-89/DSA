package Demo;
import java.util.Stack;

public class ReverseString {
	static String reverse(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			stack.push(ch);
		}
		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String str = "i like +cookies";
		System.out.println(reverse(str));
		}
	}


