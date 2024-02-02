import javax.swing.*;
import java.awt.event.*;

 class Lab3 extends JFrame implements MouseListener,MouseMotionListener

 {
   JTextField t1,t2;
   
    public Lab3()
    {
    setSize(500,700);
    t1=new JTextField();
    t2=new JTextField();
 

    add(t1);add(t2);
    addMouseListener(this);
    addMouseMotionListener(this);
    setVisible(true);

    setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseEntered(MouseEvent e)
    {
     t1.setText("IN");

    }
    public void mouseExited(MouseEvent e)
    {
      t1.setText("OUT");

    }

    public void mouseMoved(MouseEvent e)
    {
      String cord="X="+e.getX()+""+" Y="+e.getY();
      t2.setText(cord);
    }

    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}

    public static void main (String[] args)
    {
      new Lab3();
    }
 }


