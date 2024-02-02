import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;

// import java.awt.event.*;

class GUI3 implements ActionListener
{
Frame f;
TextField t;
public GUI3()
{
 f=new Frame("Software Engineer");
 t=new TextField();
Button b=new Button("Click");

f.setSize(500,500);
t.setBounds(200,100,100,50);
b.setBounds(200,300,70,50);
b.addActionListener(this);
f.add(t);f.add(b);
f.setLayout(null);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
Font font=new Font("Arial",Font.BOLD,24);
t.setFont(font);
t.setText(t.getText());
f.setBackground(Color.blue);
}

public static void main(String [] args)
{
 new GUI3();
}
}