package Stackdemo;

import java.util.Iterator;
import java.util.Stack;

public class StackUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> myStk = new Stack<>();
		myStk.push("Patterns");
		myStk.push("Java");
		System.out.println("Stack is: "+myStk);
		int size = myStk.size();
		Iterator itr = myStk.listIterator(size-1);
		while(itr.hasNext()) {
			System.out.println(itr.next());
			size--;
			if(size==0)
				break;
			itr = myStk.listIterator(size-1);
		}
		
	}

}
