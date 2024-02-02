import java.awt.*;

class GUI
{
public GUI()
{
Frame f=new Frame("Software Engineer");
TextField t=new TextField();
Button b=new Button("Click ME");
f.setSize(400,500);
t.setBounds(150,100,200,50);
b.setBounds(150,250,170,50);
f.add(t);
f.add(b);
f.setLayout(null);
f.setVisible(true);


}
public static void main(String [] args)
{
new GUI();
}
}