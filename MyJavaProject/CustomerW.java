import javax.swing.*;
import JavaObjects.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.File;
public class CustomerW extends JFrame implements ActionListener {
    JLabel name;
    Customer c;
    JLabel wallet;
    JButton seeCart;
    JButton seeProducts;
    Clock C;
    public static int mone ;
    public static int p;
    JButton back;
    public CustomerW(){
        super();
    }
    public CustomerW(String n){
        super(n);
        back = new JButton("Home");
        name = new JLabel("Hello "+n+", You want to...");
        seeCart = new JButton("See Cart");
        seeProducts = new JButton("See Products");
        c = new Customer(n,500);
        mone = 500;
        C=new Clock();
        wallet = new JLabel("Wallet : "+Integer.toString(c.getmoney()));
        setAll();
        p=0;
    }
    public void setAll(){
        seeCart.addActionListener(this);
        seeProducts.addActionListener(this);
        back.addActionListener(this);
        setSize(500, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(name);
        add(wallet);
        add(seeCart);
        add(back);
        add(seeProducts);
        C.setBounds(400,10,75,20);
        C.setVisible(true);
        name.setBounds(100, 50, 150, 20);
        wallet.setBounds(300,100,90,20);
        seeCart.setBounds(170,160,150,20);
        seeProducts.setBounds(170,230,150,20);
        back.setBounds(350,30,100,50);
    }
    public void actionPerformed(ActionEvent event){
        try {
            File file = new File("C:/Users/Abhinand Hari/Desktop/myjavaproject/files/log.txt");
            FileWriter writer = new FileWriter(file,true);
            if(event.getSource()==seeCart){
                //ProductList1 p = new ProductList1(2);
                if(p==0){
                DemoCart1 d = new DemoCart1();
            }
            else{
                dispose();
                DemoCart2 d = new DemoCart2();
            }
                writer.write(c.getname()+ " is seeing the cart \n");
            }
            if(event.getSource()==seeProducts){
                //ProductList1 p =new ProductList1(1);
                    p++;
                    DemoProduct1 d = new DemoProduct1();
                writer.write(c.getname()+ " is seeing products \n");
            }
            if(event.getSource()==back){
                
                FirstFrame f = new FirstFrame();
                dispose();
            }
            writer.close();
    }catch(Exception e){
        e.printStackTrace();
    }
}
}