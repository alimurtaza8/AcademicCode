package oopconecpts;

class Stack{
	private int array[];
	private int top = -1;
	
	Stack(int size){
		array = new int[size];
	}
	void push(int n) {
		if(top == array.length - 1) {
			System.out.println("Stack is full");
		}
		else {
			array[++top] = n;
		}
	}
	void pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		else {
			array[top--] = 0;
		}
	}
	void printStack() {
		System.out.print("[ ");
		for(int i = 0; i <= top; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("\b ]");
	}
}

public class TestStack {

	public static void main(String[] args) {
		
		Stack s = new Stack(3);
		
		s.printStack();
		s.pop();
		s.printStack();
		s.push(10);
		s.printStack();
		s.push(20);
		s.printStack();
		s.pop();
		s.printStack();
		s.push(30);
		s.printStack();
		s.push(40);
		s.printStack();
		s.push(50);
		s.printStack();
	}

}
