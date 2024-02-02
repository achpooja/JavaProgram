import javax.swing.*;
import java.awt.*;

  class Flow extends JFrame
  {
   JButton [] btns;
   public Flow()
    {
     btns= new JButton[4];
      for(int i=0;i<=3;i++)
        {
         btns [i]=new JButton("b"+(i+1));
         add(btns[i]);
        } 
      setLayout(new FlowLayout(FlowLayout.LEFT,20,25));
      setSize(400,500);
      setVisible(true);
    }
    
    public static void main(String [] args)
     {
      new Flow();
     }
  }