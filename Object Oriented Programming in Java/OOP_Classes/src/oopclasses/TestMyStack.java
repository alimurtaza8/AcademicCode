package oopclasses;
import java.util.*;

class MyStack{
	private ArrayList <Object> list = new ArrayList<>();
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public int getSize() {
		return list.size();
	}
	public Object peek() {
		return list.get(getSize()-1);
	}
	public Object pop() {
		Object o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	public void push(Object o) {
		list.add(o);
	}
	public String toString() {
		return "Stack" + list.toString();
	}
}

public class TestMyStack {

	public static void main(String[] args) {
		MyStack s = new MyStack();
		System.out.println(s.toString());

		for(int i = 0; i < s.getSize(); i++) {
			s.push(s);
		}
		
		System.out.println(s.toString());
	}

}
