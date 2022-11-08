package com.greatlearning.dsa.problem1;

import java.util.Stack;

public class BalencedBracket {
	public static boolean isStringBalenced(String bracketExpression) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			char ch = bracketExpression.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				continue;
			}
			if (stack.isEmpty()) {

				return false;
			}
			char c;

			switch (ch) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			default:
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {

		String bracketExpression = "([[{}]])";
		boolean result = isStringBalenced(bracketExpression);
		if (result) {

			System.out.println("The entered String has Balenced Brackets.");
		} else {
			System.out.println("The entered Strings do not contain Balenced Brackets.");
		}
	}
}