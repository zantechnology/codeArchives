package practice.programcreek;

import datastructures.SimpleStack;
import datastructures.Stack;

public class ReversePolishNotation {
	public static int evaluate(String[] expression) {
		
		Stack<String> stk = new SimpleStack<>();
		Integer i1, i2;
		
		for(String s: expression) {
			switch (s){
			case "*": 
				i1 = Integer.valueOf(stk.pop());
				i2 = Integer.valueOf(stk.pop());
				stk.push(String.valueOf(i2.intValue() * i1.intValue()));
				break;
			case "/": 
				i1 = Integer.valueOf(stk.pop());
				i2 = Integer.valueOf(stk.pop());
				stk.push(String.valueOf(i2.intValue() / i1.intValue()));
				break;
			case "+": 
				i1 = Integer.valueOf(stk.pop());
				i2 = Integer.valueOf(stk.pop());
				stk.push(String.valueOf(i2.intValue() + i1.intValue()));
				break;
			case "-": 
				i1 = Integer.valueOf(stk.pop());
				i2 = Integer.valueOf(stk.pop());
				stk.push(String.valueOf(i2.intValue() - i1.intValue()));
				break;
			default:
				stk.push(s);
			}
		}
		
		return Integer.valueOf(stk.pop());
	}
}
