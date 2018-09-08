package main;

public class Stack {
	
	private char[] stack;
	private int index;
	private final int sizeLimit = 100;
	
	public Stack() {
		index = -1;
		stack = new char[sizeLimit];
	}
	
	public Stack(int size) {
		index = -1;
		stack = new char[size];
	}
	
	public void push(char x) {
		stack[++index] = x;
	}
	
	public char pop() {
		return stack[index--];
	}
	
	public boolean isEmpty() {
		if (index == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String list = "";
		for (int i = 0; i <= index; i++) {
			list = list + stack[i] + " ";
		}
		return list;
	}
	
}
