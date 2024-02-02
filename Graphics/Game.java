import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


 class Game extends JFrame implements MouseMotionListener {

    public Game()
    {
        setSize(800, 600);
        setVisible(true);
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(),5,5);
    }
    public void mouseMoved(MouseEvent e)
    {}
    public static void main(String[] args)
    {
        new Game();
    }
    
}
