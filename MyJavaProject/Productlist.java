import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Scanner;
import java.io.File;

public class Productlist extends JFrame{
	JTextArea screen;
	int k;
	public Productlist(int i){
		super();
		if(i==1){
			setTitle("Available Products");
			}	else
			setTitle("--CART--");
		k=i;
		screen = new JTextArea();
		setAll();
	}
	private void setAll(){
		setSize(500, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		screen.setBounds(10, 10, 380, 250);
		add(screen);
	 	getInfo();
	}
	private void getInfo(){
		if(k==1){
			try {
				File file = new File("Products.txt");
				String t = new String("");
				Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String A = sc.nextLine();
                String B = sc.nextLine();
                String c = sc.nextLine();
                t=t+B+"\nRs : "+c+"\n";
            }
				screen.setText(t);
				System.out.println(t);
				screen.setEditable(false);
				sc.close();
			} catch (Exception e) {
			}
		}
		if(k==2){
			try {
				File file = new File("Cart.txt");
				String t = new String("");
				Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String B = sc.nextLine();
                String c = sc.nextLine();
                t=t+B+"\nQuantity : "+c+"\n";
            }
				screen.setText(t);
				System.out.println(t);
				screen.setEditable(false);
				sc.close();
			} catch (Exception e) {
			}
		}
	}
}