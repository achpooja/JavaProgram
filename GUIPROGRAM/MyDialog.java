import javax.swing.*;
import javax.swing.Box;
import java.awt.*;
import java.awt.event.*;

class MDialog
 {
   static JDialog d;
   static JLabel label;
   static JButton btn;
 
   public static void showDialog(JFrame frame,String msg,String title)

   {
    d=new JDialog(frame,title);
    d.setSize(400,100);
    label=new JLabel(msg);
    btn=new JButton("OK");

    d.setLayout(new BoxLayout(d.getContentPane(),BoxLayout.Y_AXIS));
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
   d.add(label);
   d.add(Box.createRigidArea(new Dimension(0,20)));
   d.add(btn);
   d.setVisible(true);
   d.setLocationRelativeTo(frame);
   btn.addActionListener(new ActionListener()
   {
    public void actionPerformed(ActionEvent e)
     {
      d.setVisible(false);
     }
   } 
   );
   }  
  }
  
 class MyDialog
{
  
  public void actionPerformed(ActionEvent e)
   {
    MDialog.showDialog(null,"Welcome","Software");
   }
   
   public static void main(String [] args)
   {
   new MyDialog();
   }
 }
   
