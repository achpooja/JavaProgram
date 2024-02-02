import javax.swing.*;
import java.awt.*;


public class German extends JFrame{
    public German()
    {
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        final int x=200;
        final int y=150;
        final int width=120;
        final int height=30;

        Color [] colors={Color.BLACK,Color.RED,Color.YELLOW};

        for(int i=0;i<3;i++)
        {
            g.setColor(colors[i]);
            g.fillRect(x,y+(i*height),width,height);
        }
    }

    public static void main(String[] args)
    {
        new German();
    }
    
}
