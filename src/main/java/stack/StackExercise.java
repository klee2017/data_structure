package stack;

class Stack {
	int top;
	int[] stack;
	int size;
	
	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}
	
	public int peek() {
		System.out.println("peek : " + stack[top]);
		return stack[top];
	}
	
	public void push(int val) {
		stack[++top] = val;
		System.out.println(stack[top] + " pushed.");
	}
	
	public int pop() {
		System.out.println(stack[top] + " popped.");
		return stack[top--];
	}
	
	public void printStack() {
		System.out.println("-- TOP --");
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
		System.out.println("-- BOTTOM --");
	}
}

public class StackExercise {
	public static void main(String[] args) {
		Stack stack = new Stack(100);
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		stack.printStack();
		
		stack.pop();
		stack.pop();
		
		stack.push(6);
		
		stack.printStack();
		
		stack.peek();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.push(10);
		
		stack.peek();
	}
}
