
public class LinkedList {
	public Node head=null;
	static int size =0;
/*	public static void incre() {
		size=size+1;
	}
	public static void decre() {
		size=size-1;
	}*/
	public void InsertAtHead(int x) {
		Node newone = new Node(x);
		newone.next=head;
		head=newone;
		size++;
	}
	public void Traversal() {
		if(head==null) {
			System.out.println("This list is empty..");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void InsertK(int value,int pos) {
		Node temp=head;
		int k=1;
		while(k<pos-1) {
			temp=temp.next;
			k=k+1;
		}
		Node newnode=new Node(value);
		newnode.next=temp.next;
		temp.next=newnode;
		size++;
	}
	public void InsertEnd(int x) {
		Node temp = head;
		if(head==null) {
			InsertAtHead(x);
		}
		else {
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newone = new Node(x);
		temp.next=newone;
		size++;
		}		
	}
	public int sizegiver() {
		return size;
	}
	public void searcherByValue(int x) {
		int f=0;
		Node temp = head;
		while(temp!=null) {
			if(x==temp.data) {
				f=1;
				break;
			}
			temp=temp.next;
		}
		if(f==0) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Found");
		}
	}
	public void searcherByPos(int x) {
		if(x>size) {
			System.out.println("Out of bounds..");
		}
		Node temp = head;
		while(x!=0) {
			temp=temp.next;
			x--;
		}
		System.out.println(temp.data);		
	}
}
