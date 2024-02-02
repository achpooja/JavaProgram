import javax.swing.*;
import java.awt.event.*;

class GUI7 implements MouseListener,MouseMotionListener
{
JFrame f;
JTextField t1,t2;
 public GUI7()
 {
  f=new JFrame();
  f.setSize(500,700);
  t1=new JTextField();
  t2=new JTextField();
  t1.setBounds(150,100,300,75);
  t2.setBounds(150,300,300,75);

  f.add(t2);f.add(t1);
  f.addMouseListener(this);
  f.addMouseMotionListener(this);

  f.setLayout(null);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 }
 public void mouseEntered(MouseEvent e)
 {
 t1.setText("Inside");
 } 
 public void mouseExited(MouseEvent e)
 {
  t1.setText("Outside"); 
 }
 public void mouseMoved(MouseEvent e)
 {
  String cord="X="+e.getX()+" "+"Y="+e.getY();
  t2.setText(cord);
 }
 public void mouseClicked(MouseEvent e){}
 public void mousePressed(MouseEvent e){}
 public void mouseReleased(MouseEvent e){}
 public void mouseDragged(MouseEvent e){}

 public static void main(String [] args)
 {
 new GUI7();
 }
}