import java.awt.*;
import java.awt.event.*;

class GUI9 implements ActionListener
{
Frame f;
TextField t;
Button b,b1;
public GUI9()
{
 f=new Frame("Software Engineer");
 t=new TextField();
 b=new Button("Blue");
 b1=new Button("Red");

f.setSize(500,500);
t.setBounds(200,100,100,50);
b.setBounds(50,300,50,50);
b1.setBounds(150,300,50,50);
b.addActionListener(this);
b1.addActionListener(this);
f.add(t);f.add(b);f.add(b1);
f.setLayout(null);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
Font font=new Font("Arial",Font.BOLD,24);
t.setFont(font);
t.setText(t.getText());

if(e.getSource()==b)
{
f.setBackground(Color.blue);
 }
else
{
f.setBackground(Color.red);
}
}

public static void main(String [] args)
{
 new GUI9();
}
}