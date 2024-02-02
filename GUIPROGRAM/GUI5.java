import java.awt.*;
import java.awt.event.*;

class GUI5
{
Frame f;
TextField t;
public GUI5()
{
 f=new Frame("Software Engineer");
 t=new TextField();
Button b=new Button("Click");

f.setSize(500,500);
t.setBounds(200,100,100,50);
b.setBounds(200,300,70,50);

f.add(t);f.add(b);
f.setLayout(null);
f.setVisible(true);

Controller c=new Controller(this);
b.addActionListener(c);

}
public void actionPerformed(ActionEvent e)
{
Font font=new Font("Arial",Font.PLAIN,24);
t.setFont(font);
t.setText(t.getText());
f.setBackground(Color.red);
}

public static void main(String [] args)
{
new GUI5();
}
}

class Controller implements ActionListener
{
GUI5 g;
public Controller (GUI5 g)
{
    this.g=g;
}

public void actionPerformed(ActionEvent e)
{
    g.actionPerformed(e);


}
}

