import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wanna insert?(1=yes/2=no) or exit[0]??");
		int ch = sc.nextInt();
		if(ch==0) {
			System.out.println("Goodbye ^_^");
			sc.close();
			return ;
		}
		while(ch==1) {
			System.out.println("At 1.Head 2. Tail 3.Your specified position??");
			int i = sc.nextInt();
			System.out.println("Enter value:");
			if(i==1) {
				int d = sc.nextInt();
				LL.InsertAtHead(d);
			}
			if(i==3) {
				int value = sc.nextInt();
				System.out.println("At which position??");
				int pos = sc.nextInt();
				LL.InsertK(value, pos);
			}
			if(i==2) {
				int d = sc.nextInt();
				LL.InsertEnd(d);
			}
			System.out.println("Wanna continue??(1=yes/2==No)");
			ch=sc.nextInt();
		}
		
		System.out.println("What should I do...???");
		int i=1;
		while(i<6&&i>0) {
		System.out.println("1.search by value 2.print 3.size 4.middle element");
		System.out.println("5.search by position");
		i = sc.nextInt();
		if(i==2)
			LL.Traversal();
		if(i==1) {
			System.out.println("Search for?? :");
			int x = sc.nextInt();
			LL.searcherByValue(x);
		}
		if(i==3) {
			System.out.println(LL.sizegiver());
		}
		if(i==4) {
			LL.searcherByPos((LL.sizegiver()/2));
		}
		if(i==5) {
			int x = sc.nextInt();
			LL.searcherByPos(x);
		}
		}
	sc.close();
	}
}
