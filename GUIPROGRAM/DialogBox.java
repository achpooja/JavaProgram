import javax.swing.*;
import java.awt.event.*;

class DialogBox extends JFrame implements ActionListener,WindowListener
  {
    JButton b;
     
    public DialogBox()
     {
      b=new JButton("CLICK");
      add(b);
      pack();
      setVisible(true);

      b.addActionListener(this);
        addWindowListener(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      } 
     
     public void actionPerformed(ActionEvent e)
      {
      //  String s=JOptionPane.showInputDialog(null,"Enter an Integer");
           String s=InDialog.inputDialog(null,"Enter your age","Software");
       int n=Integer.parseInt(s);

          if(n%2==0)
           {
            //  JOptionPane.showMessageDialog(null,"It is a even number","DialogBox",JOptionPane.PLAIN_MESSAGE);
              MsgDialog.showDialog(null,"Welcome","Software");
            }
           else
           {
            //  JOptionPane.showMessageDialog(null,"It is a odd number");
             MsgDialog.showDialog(null,"Welcome","Software");
           }
      }

      public void windowClosing(WindowEvent e)
      {
      int c=JOptionPane.showConfirmDialog(null,"Do ypu want to exit?","DialogBox",JOptionPane.OK_CANCEL_OPTION);
      if(c==JOptionPane.OK_OPTION)
           {
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
      }
      public void windowClosed(WindowEvent e)
       {}
      public void windowActivated(WindowEvent e)
       {}
      public void windowDeactivated(WindowEvent e)
       {}
      public void windowOpened(WindowEvent e) 
       {}

      public void windowIconified(WindowEvent e)
       {}
      public void windowDeiconified(WindowEvent e)
       {}
     public static void main(String [] args) 
       {
       new DialogBox();
       }
  }