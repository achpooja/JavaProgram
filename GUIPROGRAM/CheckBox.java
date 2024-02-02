import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CheckBox extends JFrame implements ItemListener
  {
    JCheckBox se,it;
     public CheckBox()
       {
       setSize(300,400);
       se=new JCheckBox("SE",true);
       it=new JCheckBox("IT",true);
        add(se);
        add(it);
        setLayout(new FlowLayout());
         setVisible(true);

      
        it.addItemListener(this);
        se.addItemListener(this);

       }

      public void itemStateChanged(ItemEvent e)
        {
          if(e.getSource()==se)
           { 
             if(e.getStateChange()==1)
               {
                  System.out.print("Software is selected");
                }
              else
                {
                  System.out.print("Software is unselected");
                 }
             }
           else if(e.getSource()==it)
            {
             if(e.getStateChange()==1)
               {
                System.out.print("It is selected");
               }
             else 
               {
                System.out.print("It is unselected");
               }
              }
            }
        public static void main(String [] args)
         {
          new CheckBox();
         }
  }