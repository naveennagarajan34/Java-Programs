package collections;

import java.util.Stack;

public class StackCheckBalancedParanthesis {

	public static void main(String[] args) {
		// System.out.println("Check Balanced Paranthesis");
		String checkBalance = "({[]()}())";
		Stack<Character> st = new Stack<Character>();
		st.push('.'); // Stack should not be empty so adding dummy character
		for (char ch : checkBalance.toCharArray()) {
			char top = st.peek();
			if (top == '{' && ch == '}' || top == '[' && ch == ']' || top == '(' && ch == ')') {
				st.pop();
			} else {
				st.push(ch);
			}
		}
		st.pop(); // removing dummy character
//		System.out.println(st);
		if (st.isEmpty()) {
			System.out.println("The given string is balanced..");
		} else {
			System.out.println("The given string is not balanced..");
		}

	}

}
