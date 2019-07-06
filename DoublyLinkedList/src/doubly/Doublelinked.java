package doubly;


public class Doublelinked {

	    public Node head=null;
	    public void Insert_at_head(int d) {
	    	 Node newnode= new Node(d);
	    	 if(head==null) {
	    		 head=newnode;
	    	 }
	    	 else {
		       newnode.next=head;
		       head.prev=newnode;
		       newnode.prev=null;
		       head=newnode;
	    	 }
	    }
	 	public void Insert_at_position_k(int d,int k) {
	       Node newnode= new Node(d);
	       if(head==null) {

	    	   head=newnode;
	       }
	       else {
	    	   Node temp=head;
	    	   int i=1;
	    	   while(i<k-1) {
	    		   temp=temp.next;
	    		   i++;
	    	   }
	    	   newnode.next=temp.next;
	    	   temp.next.prev=newnode;
	    	   temp.next=newnode;
	    	   newnode.prev=temp;
	    	   
	       }
		}
	 	public void Insert_at_tail(int d) {
	 		 Node newnode= new Node(d);
	 		 Node temp=head;
	 		 while(temp.next!=null)
	 		 {
	 			 temp=temp.next;
	 		 }
	 		 newnode.prev=temp;
	 		 temp.next=newnode;
	 	}
	 	public void traversal()
	 	 {
	 		 Node temp=head;
	 		 System.out.println("The elements in the linked list are : ");
	 		 while(temp!=null)
	 		 {
	 			 System.out.println(temp.data);
	 			 temp=temp.next;
	 			 
	 		 }
	 	 }
	    public void	Delete_at_position_k(int k){
	 		if(k==1)
	 		{
	 			head=head.next;
	 			head.prev=null;
	 			
	 		}
	 		else {
	 			int i=1;Node temp=head;
	 			while(i<k-1) {
	 				temp=temp.next;
	 				i++;
	 			}
	 		
	 				temp.next=temp.next.next;
	 				temp.next.prev=temp;
	 		}
	 	}

}
