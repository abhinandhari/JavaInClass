import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import  java.time.LocalDateTime;
import javax.swing.SwingConstants;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import JavaObjects.*;
import javax.swing.ImageIcon;
public class FirstFrame extends JFrame implements ActionListener{
   JButton admin;
   JButton customer;
   JLabel hypno;
   Clock c;
    FirstFrame(){
        c=new Clock();
        setTitle("WELCOME!!");
        setSize(300,150);
        admin = new JButton("Admin");
        customer = new JButton("Customer");
        //ImageIcon h = new ImageIcon(this.getClass().getResource("anim1.gif"));
        admin.addActionListener(this);
        customer.addActionListener(this);
        hypno = new JLabel("WELCOME !",JLabel.CENTER);
        //hypno = new JLabel(h,JLabel.CENTER);
        add(admin,BorderLayout.WEST);
        add(customer,BorderLayout.EAST);
        add(hypno,BorderLayout.CENTER);
        add(c,BorderLayout.NORTH); 
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==admin){
        dispose();
        AdminDetailFrame A = new AdminDetailFrame();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"); 
        LocalDateTime now = LocalDateTime.now();  
        try{
        File file = new File("C:/Users/Abhinand Hari/Desktop/myjavaproject/files/log.txt");
        FileWriter writer = new FileWriter(file,true);
        writer.write("ADMIN ACCESS REQUESTED - "+formatter.format(now)+"\n");
        writer.close();
        }catch(IOException ee){
          ee.printStackTrace();}
      }
      else{
        dispose();
        CustomerFrame C = new CustomerFrame();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"); 
        LocalDateTime now = LocalDateTime.now();  
        try{
        File file = new File("log.txt");
        FileWriter writer = new FileWriter(file,true);
        writer.write("A CUSTOMER WANTS TO LOG IN... - "+formatter.format(now)+"\n");
        writer.close();
        }catch(IOException ee){
          ee.printStackTrace();}
      }
    }

}