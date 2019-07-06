package doubly;

public class Driver {
	public static void main(String[]args) {
		Doublelinked d=new Doublelinked();
		d.Insert_at_head(9);
		d.Insert_at_head(8);
		d.Insert_at_position_k(3, 1);
		d.Insert_at_tail(5);
		d.traversal();
		d.Delete_at_position_k(2);
		d.traversal();
	}
	
	

}
