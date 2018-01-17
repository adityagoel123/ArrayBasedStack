package com.aditya.mlabs.structures.ArrayBasedStack;

public class ArrayBasedStack implements Stack {

	public static final int CAPACITY = 1024;		// Default Capacity of Stack. 
	private Object S[];								// S holds the elements of Stack. 
	private int t = -1;								// The Top element index of Stack. 
	
	public ArrayBasedStack() {
		S = new Object[CAPACITY];
	}
	
	public void push(Object element) throws StackFullException {
		if((t+1) >= (CAPACITY -1)){
			throw new StackFullException("Stack is full");
		} else {
			S[t+1] = element;
			t++;
		}
		
	}

	public Object pop() {
		if(t == -1){
			throw new StackEmptyException("Stack is Empty");
		} else {
			Object popedElement = S[t];
			S[t] = null;
			t --;
			return popedElement;
		}
	}
	
	public int size() {
		return t+1;
	}

	public boolean isEmpty() {
		return (t == -1);
	}

	public Object top() throws StackEmptyException {
		if(t == -1){
			throw new StackEmptyException("Stack is Empty");
		} else {
			return S[t];
		}
	}


	
	
	
}
