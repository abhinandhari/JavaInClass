import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.File;
import JavaObjects.*;
import javax.swing.JOptionPane;
public class AdminPowerFrame extends JFrame implements ActionListener{
    JButton Cproducts;
    JButton Dproducts;
    JButton Iproducts;
    JButton back;
    static int p;
    public AdminPowerFrame(){
        super("--ADMINISTRATOR--");
        Cproducts = new JButton("See Products");
        Dproducts = new JButton("Delete Products");
        Iproducts = new JButton("Insert Products");
        back = new JButton("Log out...");
        setAll();
        add(Cproducts);
        add(Dproducts);
        add(Iproducts);
        add(back);
        p=0;
    }
    private void setAll(){
        setSize(450,150);
        setLayout(new GridLayout(2,2));
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Cproducts.addActionListener(this);
        Dproducts.addActionListener(this);
        Iproducts.addActionListener(this);
        back.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        try {
            File file = new File("C:/Users/Abhinand Hari/Desktop/myjavaproject/files/log.txt");
            FileWriter writer = new FileWriter(file,true);
            if(e.getSource()==Cproducts){
                writer.write("Admin wants to see products\n");
                //ProductList1 P = new ProductList1(1);
                if(p==0){
                    p++;
                    DemoProduct3 a = new DemoProduct3();
                }else{
                        DemoProduct4 a = new DemoProduct4();
                        p++;
                }
            }
            if(e.getSource()==Dproducts){
                DemoProduct2 p = new DemoProduct2();
                writer.write("Admin wants to delete products\n");
    
            }
            if(e.getSource()==Iproducts){
                DemoInsert d = new DemoInsert();
                writer.write("Admin wants to insert products\n");
            }
            if(e.getSource()==back){
                writer.write("Logged out...");
                dispose();
                FirstFrame F = new FirstFrame();
            }
        writer.close();
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null,ee.getClass());
            //TODO: handle exception
        }    
    }
}