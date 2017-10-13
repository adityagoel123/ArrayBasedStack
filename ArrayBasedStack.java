package com.aditya.mlabs.structures;

public class ArrayBasedStack implements Stack {

	
	public static final int CAPACITY = 1024;		// Default Capacity of Stack. 
	private int N;									// Maximum Capacity of Stack.
	private Object S[];								// S holds the elements of Stack. 
	private int t = -1;								// The Top element of Stack. 
	
	public ArrayBasedStack() {
		this(CAPACITY);
	}
	
	public ArrayBasedStack(int cap) {
		N = cap;
		S = new Object[N];
	}

	@Override
	public int size() {
		// Returns the Current Size of Stack.
		return (t+1);
	}

	@Override
	public boolean isEmpty() {
		// Returns true if Stack is empty.
		return (t < 0);
	}

	@Override
	public void push(Object element) throws StackFullException {
		// Push a new element on the Stack.
		if (size() == N){
			throw new StackFullException("Stack overflow");
		}
		S[++t] = element;
	}

	@Override
	public Object top() throws StackEmptyException {
		// Fetches Top Stack Element
		if(isEmpty()){
			throw new StackEmptyException("Stack is empty");
		}
		return S[t];
	}
	
	@Override
	public Object pop() throws StackEmptyException {
		// Pop off the Top Stack element
		Object choppedElement;
		if(isEmpty()){
			throw new StackEmptyException("Stack is empty");
		}
		choppedElement = S[t];
		S[t] = null; 		// Dereference the Top Element. 
		t--;				// Decrement top.
		return choppedElement;
	}

}
