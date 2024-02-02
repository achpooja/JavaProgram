import javax.swing.*;

import java.text.*;
import java.util.*;
public class DigitalClock extends JFrame{

    JLabel label;
    public DigitalClock()
    {
        setSize(300,200);
        label=new JLabel();
        add(label);
        setVisible(true);
    }

    public void showTime()
        {
          Calendar cal=Calendar.getInstance();
          SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");

          while(true)
          {
            String time=f.format(cal.getTime());
            label.setText(time);
            
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
          }


        }

        public static void main(String[] args)
        {
            DigitalClock d=new DigitalClock();
            d.showTime();
        }
    
  
    
}
