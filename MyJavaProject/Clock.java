import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
public class Clock extends JLabel implements Runnable {
    Thread clock;
    String time;
    Calendar cal;
    Clock(){
        clock = new Thread(this);
        clock.start();
    }
    public void run(){
        setHorizontalAlignment(SwingConstants.RIGHT);
        try{
            while(true){
                cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                Date date = cal.getTime();
                time = formatter.format( date );
                setText(time);
                clock.sleep( 1000 );
            }
        }catch(Exception e){}
    }
}