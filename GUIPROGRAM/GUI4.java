import java.awt.*;
import java.awt.event.*;


class GUI4
{
Frame f;
TextField t;
public GUI4()
{
 f=new Frame("Software Engineer");
 t=new TextField();
Button b=new Button("Click");

f.setSize(500,500);
t.setBounds(200,100,100,50);
b.setBounds(200,300,70,50);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
Font font=new Font("Arial",Font.BOLD,24);
t.setFont(font);
t.setText(t.getText());
f.setBackground(Color.blue);
}
});
f.add(t);f.add(b);
f.setLayout(null);
f.setVisible(true);

}


public static void main(String [] args)
{
 new GUI4();
}
}