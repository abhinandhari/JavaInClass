import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import JavaObjects.*;
import javax.swing.JOptionPane;
public class CustomerFrame extends JFrame implements ActionListener {
    JLabel name;
    JTextArea cname;
    JLabel justTexT;
    JLabel wallet;
    JButton OK;
    Clock c;

    CustomerFrame(){
        super();
        c = new Clock();
        name = new JLabel("Enter your name :");
        cname = new JTextArea();
        justTexT = new JLabel("YOU WANT TO...");
        wallet = new JLabel();
        OK = new JButton("OK");
        setTitle("Customer");
      //  seeCart = new JButton("Check Cart");
      //  seeProducts = new JButton("See Products");
        setAll();
        add(name);
        add(cname);
        add(justTexT);
        add(wallet);
        add(OK);
     //   add(seeCart);
        add(c);
       // add(seeProducts);
    }    
    private void setAll(){
        setSize(500, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c.setBounds(400,0,75,20);
        c.setVisible(true);
        cname.setBounds(300, 100, 150, 20);
        name.setVisible(true);
        name.setBounds(40,100,180,20);
        name.setVisible(true);
        justTexT.setBounds(100,100,100,20);
        justTexT.setVisible(false);
        wallet.setBounds(300,100,90,20);
        wallet.setVisible(false);
        wallet.setText("Wallet :");
        /*seeCart.setBounds(170,160,150,20);
        seeCart.setVisible(false);
        seeCart.addActionListener(this);*/ 
        OK.setBounds(220,150,60,20);
        OK.setVisible(true);
        OK.addActionListener(this);
        /*seeProducts.setBounds(170,230,150,20);
        seeProducts.setVisible(false);
        seeProducts.addActionListener(this);*/
    }
    public void actionPerformed(ActionEvent e){
        try {
            File file = new File("C:/Users/Abhinand Hari/Desktop/myjavaproject/files/log.txt");
            FileWriter writer = new FileWriter(file,true);
            if(e.getSource()==OK){
               CustomerW c = new CustomerW(cname.getText());
               
            writer.write("Customer "+cname.getText()+" HAS ENTERED \n");
            dispose();
        }
        writer.close();
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null,ee.getClass());
        }
    }
    
}