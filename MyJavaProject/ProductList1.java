import java.io.File;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JavaObjects.Product;
import java.awt.FlowLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.io.File;
import java.awt.Dimension;
public class ProductList1 extends JFrame implements ActionListener{
    JPanel panel;
    JButton b;
    //JScrollPane scrollpane;
    int k;
    Product[] products;
    JLabel[] pname;
    JLabel[] cost;
    JButton[] scene;
	public ProductList1(int i){
        super();
        products = new Product[100];
		if(i==1){
			setTitle("Available Products");
			}	else
			setTitle("--CART--");
		k=i;
        panel = new JPanel();
        panel.setBounds(10,10,225,400);
        //scrollpane = new JScrollPane(panel);
        //scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);  
        //scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.setLayout(null);
        products = new Product[100];
        pname = new JLabel[100];
        cost = new JLabel[100];
        scene = new JButton[100];
		setAll();
	}
	private void setAll(){
        //setSize(300, 200); 
        setLayout(new BorderLayout());
        setVisible(true);
        panel.setLayout(null);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(BorderLayout.CENTER,panel);
	 	getInfo();
    }
	private void getInfo(){
        int x = 50;
        int y = 30;
        int c=0;
		if(k==1){
			try {
                FileInputStream fi = new FileInputStream(new File("Files//Product.dat"));
                ObjectInputStream oi = new ObjectInputStream(fi);
                c=0;
            while(true) {
                products[c]=(Product)oi.readObject();   
                pname[c]= new JLabel(products[c].name);
                System.out.print(products[c]);
                cost[c] = new JLabel(Integer.toString(products[c].price));
                scene[c]= new JButton("Add2Cart");
                panel.add(pname[c]);
                panel.add(cost[c]);
                panel.add(scene[c]);             
                c++;        
                scene[c].addActionListener(this);          
                y+=65;
                System.out.print(c);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Finished Loading");
        }
    }
		if(k==2){
            try {
                File f = new File("Files//Cart.dat");
                FileInputStream fi = new FileInputStream(f);
                ObjectInputStream oi = new ObjectInputStream(fi);
                c=0;
            while(true) {
                products[c]=(Product)oi.readObject();   
                pname[c]= new JLabel(products[c].name);
                System.out.print(products[c]);
                cost[c] = new JLabel(Integer.toString(products[c].price));
                scene[c]= new JButton("Delete");
                panel.add(pname[c]);
                panel.add(cost[c]);
                panel.add(scene[c]);   
                scene[c].addActionListener(this);          
                c++;        
                y+=65;   
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
    }    
    panel.setLayout(new GridLayout((c),3));
    panel.setVisible(true);
    panel.setSize(410,y+50);
    setSize(300,y+75);
}
    public void actionPerformed(ActionEvent event){
        Product temp = new Product();
        JOptionPane.showMessageDialog(null, "Clicked!");
        for(int i=0;i<scene.length;i++){
            try {
                JOptionPane.showMessageDialog(null, "Added!");
                    FileInputStream fi = new FileInputStream(new File("Files//Product.dat"));
                    ObjectInputStream oi = new ObjectInputStream(fi);
                    if(event.getSource()==scene[i]){
                        scene[i].setVisible(false);
                        for(int j=0;j<(i+1);j++){
                            temp = (Product)oi.readObject();
                        }
                        FileOutputStream output = new FileOutputStream(new File("Files//Cart.dat"));
                        ObjectOutputStream op = new ObjectOutputStream(output);
                        op.writeObject(temp);
                    }
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getClass());
                //TODO: handle exception
            }
        }
    }
}