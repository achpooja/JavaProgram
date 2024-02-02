import javax.swing.*;
import javax.swing.Box;
import java.awt.*;
import java.awt.event.*;
  
  class InDialog
 {
   static JDialog d;
   static JLabel label;
   static JTextField text;
   static JButton btn;
   static String str;
  
 
   public static String inputDialog(JFrame frame,String msg,String title)

   {
    
    d=new JDialog(frame,title);
    d.setSize(400,150);
    label=new JLabel(msg);
    btn=new JButton("OK");
  
    text=new JTextField();
    str=text.getText();
  
    d.setLayout(new BoxLayout(d.getContentPane(),BoxLayout.Y_AXIS));
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
   d.add(label);
   d.add(text);
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
   return str; 
   }
  

  
   public static void main(String [] args)
   {
  
   new InDialog();
   }
  }
  
 
   
