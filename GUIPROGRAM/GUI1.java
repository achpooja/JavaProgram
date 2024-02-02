import java.awt.*;
import java.awt.event.*;

class GUI1 extends Frame implements ActionListener
{
TextField t;
public GUI1()
{
t=new TextField();
Button b=new Button("CLICK ME FAST");
setSize(400,500);
t.setBounds(150,100,200,50);
b.setBounds(150,250,170,50);
b.addActionListener(this);
add(b);
add(t);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
t.setText("WELCOME SOFTWARE ENGINEER");
}

public static void main(String [] args)
{
new GUI1();
}

}