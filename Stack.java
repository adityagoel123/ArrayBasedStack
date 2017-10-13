package com.aditya.mlabs.structures;

public interface Stack {

	// Accessories Methods
	public int size();
	public boolean isEmpty();
	public Object top() throws StackEmptyException;
	
	// Update Methods 
	public void push(Object element) throws StackFullException;
	public Object pop() throws StackEmptyException;
}
