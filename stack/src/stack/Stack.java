package stack;


public class Stack {
	Node top=null;	
	public void push(int d)
	{
		Node newnode=new Node(d);
		if(top==null)
			top=newnode;
		else {
		newnode.next=top;
		top=newnode;
		}
		
	}
	public void pop() {
		if(top==null)
			System.out.println("Stack Underflow");
		else {
			top=top.next;
		}
	}
	public boolean IsEmpty() {
		if(top==null) return true;
		else return false;
		
		
	}
	public void traversal()
	{
		Node temp=top;
		 System.out.println("The elements in the stack are : ");
		 while(temp!=null)
		 {
			 System.out.println(temp.data);
			 temp=temp.next;
			 
		 }
	}
}
