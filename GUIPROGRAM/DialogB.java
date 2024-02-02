import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Box;

public class DialogB extends JFrame implements ActionListener
 {
    JButton b;
    public DialogB()
    {
        b=new JButton("click");
        add(b);
        setSize(400,500);
        setVisible(true);
        b.addActionListener(this); 
       }
       public void actionPerformed(ActionEvent e)
       {
        // JOptionPane.showMessageDialog(this,"Hello, world!");
        //  String s=IDialog.inputDialog(null, "Enter number","SE");
        //  Integer n=Integer.valueOf(s);
        // JOptionPane.showMessageDialog(this,"Hello, world!");

        String s=JOptionPane.showInputDialog(this,"Enter number");
        int n=Integer.parseInt(s);
        if(n%2==0)
        {
         Ddialog.showDialog(this,"Even","SE");
        // System.out.println("Hello Even");
          }
       }
       public static void main(String[] args)
       {
         new DialogB();
       }
}

class Ddialog
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

// class IDialog
// {
//   static JDialog d;
//   static JLabel label;
//   static JTextField text;
//   static JButton btn;
//   static String str;
 

//   public static String inputDialog(JFrame frame,String msg,String title)

//   {
   
//    d=new JDialog(frame,title);
//    d.setSize(400,150);
//    label=new JLabel(msg);
//    btn=new JButton("OK");
 
//    text=new JTextField();
//    str=text.getText();
 
//    d.setLayout(new BoxLayout(d.getContentPane(),BoxLayout.Y_AXIS));
//    label.setAlignmentX(Component.CENTER_ALIGNMENT);
//   d.add(label);
//   d.add(text);
//   d.add(Box.createRigidArea(new Dimension(0,20)));
//   d.add(btn);
//   d.setVisible(true);
//   d.setLocationRelativeTo(frame);
//   btn.addActionListener(new ActionListener()
//   {
//    public void actionPerformed(ActionEvent e)
//     {
//      d.setVisible(false);
//     }
//   } 
//   );
//   return str; 
//   }
// }

