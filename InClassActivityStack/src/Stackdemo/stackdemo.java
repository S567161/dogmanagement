package Stackdemo;

import java.util.Arrays;

public class stackdemo {

	private int[] stack;
	private int maxSize;
	private int top;
	
	public stackdemo(int size) {
		maxSize = size;
		stack = new int[size];
		top = -1;
	}
	
	public void pushRandom(int element) {
		System.out.println("If the stackis empty: "+isFull());
		top = top + 1;
		stack[top] = element;
	}
	
	public int popRandom(){
		System.out.println("If the stackis empty: " +isEmpty());
		int topElement = stack[top];
		top = top-1;
		return topElement;
	}
	
	public boolean isFull() {
		if(top == maxSize-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public void print() {
		for(int i=0; i<=top; i++) {
			System.out.println(stack[i] + " ");
		}
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(stack));
	}
	
	public int peek() {
		int peekElement = stack[top];
		return peekElement;
	}
}
