package com.stackques;

public class Stack {

	StackList list = new StackList();

	public static void main(String[] args) {
	    Stack stack = new Stack();
	    
	    stack.push(70);
	    stack.push(30);
	    stack.push(56);
	    stack.showElements();
	    
		stack.pop();
		stack.showElements();
		
		stack.pop();
		stack.showElements();
		
		stack.pop();
		stack.showElements();
}
	
	public void push(Object data) {
		list.addLast(data);
	}

	public void pop() {
		list.pop();
	}

	public void showElements() {
		list.print();
	}
	
}
