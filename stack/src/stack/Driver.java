package stack;

public class Driver {
	public static void main(String[]args) {
		Stack s=new Stack();
		s.push(3);
		s.push(5);
		s.push(8);
		s.pop();
		System.out.println("Stack Empty: "+s.IsEmpty());
		s.traversal();
	}

}
