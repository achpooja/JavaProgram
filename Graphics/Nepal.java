import javax.swing.*;
import java.awt.*;


public class Nepal extends JFrame{
    public Nepal()
    {
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
     int [] x = {100,200,100};
     int [] y1 = {50,100,150};
     g.setColor(Color.RED);
     g.fillPolygon(x,y1,3);
     int [] y2={150,200,250};
     g.fillPolygon(x,y2,3);
     g.drawLine(100,50,100,300);
    }

    public static void main(String[] args)
    {
        new Nepal();
    }
    
}

