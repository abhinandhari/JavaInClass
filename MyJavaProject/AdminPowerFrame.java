import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.File;
public class AdminPowerFrame extends JFrame implements ActionListener{
    JButton Cproducts;
    JButton Dproducts;
    JButton Iproducts;
    public AdminPowerFrame(){
        super("--ADMINISTRATOR--");
        Cproducts = new JButton("See Products");
        Dproducts = new JButton("Delete Products");
        Iproducts = new JButton("Insert Products");
        setAll();
        add(Cproducts);
        add(Dproducts);
        add(Iproducts);
    }
    private void setAll(){
        setSize(450,150);
        setLayout(new GridLayout(1,3));
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Cproducts.addActionListener(this);
        Dproducts.addActionListener(this);
        Iproducts.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        try {
            File file = new File("log.txt");
            FileWriter writer = new FileWriter(file,true);
            if(e.getSource()==Cproducts){
                writer.write("Admin wants to see products\n");
                Productlist P = new Productlist(1);
            }
            if(e.getSource()==Dproducts){
                writer.write("Admin wants to delete products\n");
    
            }
            if(e.getSource()==Iproducts){
                writer.write("Admin wants to insert products\n");
            }
        writer.close();
        } catch (Exception ee) {
            //TODO: handle exception
        }    
    }
}