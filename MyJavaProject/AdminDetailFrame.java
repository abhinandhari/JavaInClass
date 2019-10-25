import javax.swing.JFrame;
import javax.print.event.PrintJobListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import  java.time.LocalDateTime;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import JavaObjects.*;
import java.io.IOException;
public class AdminDetailFrame extends JFrame implements ActionListener{
    JLabel n;
    JLabel p;
    JTextArea name;
    JPasswordField pass;
    JButton confirm;
    JButton cancel;
    String NAME ;
    String PASS;
    Clock c;
    AdminDetailFrame(){
        super();
        setTitle("---LOGIN---");
        confirm = new JButton("CONFIRM");
        cancel = new JButton("CANCEL");
        name = new JTextArea();
        pass = new JPasswordField();
        n = new JLabel("Name : ");
        p = new JLabel("Password : ");
        NAME = new String("example");
        PASS = new String("1234");
        c= new Clock();
        setAllDetails();
        addAllDetails();
    }
    private void setAllDetails(){
        name.setBounds(140, 20, 120, 20);
        pass.setBounds(140,65,120, 20);
        n.setBounds(40,20,60,20);
        p.setBounds(40,65,80,20);
        confirm.setBounds(40, 100, 100, 35);
        cancel.setBounds(140, 100, 100, 35);
        c.setBounds(200,0,75,20);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        confirm.addActionListener(this);
        cancel.addActionListener(this);

    }
    private void addAllDetails(){
        add(name);
        add(n);
        add(p);
        add(pass);
        add(confirm);
        add(cancel);
        add(c);
    }
    private void reset(){
        name.setText("");
        pass.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        File file = new File("C:/Users/Abhinand Hari/Desktop/myjavaproject/files/log.txt");
        FileWriter writer = new FileWriter(file,true);
        if(e.getSource()==confirm){
            writer.write("Confirmed Click... ");
            String U = name.getText();
            U=U.trim();
            //System.out.println(U);
            String P = pass.getText();
            //System.out.println(P);
            if(U.equals(NAME)&&P.equals(PASS)){
                writer.write("SUCCESSFULL \n");
                JOptionPane.showMessageDialog(null,"SUCCESSFULL!!");
                dispose();
                AdminPowerFrame A = new AdminPowerFrame();
            }else{
                JOptionPane.showMessageDialog(null,"Wrong information!");
                reset();
                writer.write("Denied... \n");
            }
        }else{
            dispose();
            writer.write("CANCELLED");
            FirstFrame P = new FirstFrame();
        }
        writer.close();
    }catch(IOException ee){
        ee.printStackTrace();
    }
    }
}