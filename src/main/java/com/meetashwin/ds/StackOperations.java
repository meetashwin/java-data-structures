package com.meetashwin.ds;

public class StackOperations {

	int top;
	int[] arr = new int[1000];

	public StackOperations() {
		top = -1;
	}

	/**
	 * Push an integer element into stack
	 * @param elem
	 */
	public void push(int elem) {
		arr[++top] = elem;
	}

	/**
	 * Pop the top element from stack
	 * @return
	 */
	public int pop() {
		if (top == -1)
			return top;

		return arr[top--];
	}

	/**
	 * Check if the stack is empty
	 * @return true if empty
	 */
	public boolean isEmpty() {
		return (top == -1) ? true : false;
	}
} 