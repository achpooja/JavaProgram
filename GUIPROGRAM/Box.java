import javax.swing.*;
// import java.awt.*;

  class Box extends JFrame
  {
   JButton [] btns;
   public Box()
    {
     btns= new JButton[4];
      for(int i=0;i<=3;i++)
        {
         btns [i]=new JButton("b"+(i+1));
         add(btns[i]);
        } 
      setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
      setSize(400,500);
      setVisible(true);
    }
    
    public static void main(String [] args)
     {
      new Box();
     }
  }