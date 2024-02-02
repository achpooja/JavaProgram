import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Radio extends JFrame implements ActionListener
  {
    JRadioButton se,it;
     public Radio()
       {
       setSize(300,400);
       se=new JRadioButton("SE",true);
       it=new JRadioButton("IT",true);
        add(se);
        add(it);
        setLayout(new FlowLayout());
         setVisible(true);

       ButtonGroup bg=new ButtonGroup();
        bg.add(it);
        bg.add(se);
        it.addActionListener(this);
        se.addActionListener(this);

       }

      public void actionPerformed(ActionEvent e)
        {
          if(e.getSource()==se)
           {
            MsgDialog.showDialog(null, "Software is selected","Software");
           }
           
           else
            {
            MsgDialog.showDialog(null,"IT is selected","IT");
            }
         }
        public static void main(String [] args)
         {
          new Radio();
         }
  }

