import javax.swing.*;
import java.awt.event.*;
public class PopMenu1 extends JFrame implements MouseListener{
    JPopupMenu menu;
    JMenuItem sa,cpy,cut,exit;

    public PopMenu1()
    {
        setSize(400,500);
        menu=new JPopupMenu("Menu");
        sa=new JMenuItem("Select");
        cpy=new JMenuItem("Copy");
        cut=new JMenuItem("Cut");
        exit=new JMenuItem("Exit");
        add(menu);
        menu.add(sa);
        menu.add(cpy);
        menu.add(cut);
        menu.add(exit);

        addMouseListener(this);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e)
    {
        menu.show(this,e.getX(),e.getY());
    }
    public void mouseEntered(MouseEvent e)
    {}
    public void mouseExited(MouseEvent e)
    {}
    public void mousePressed(MouseEvent e)
    {}
    public void mouseReleased(MouseEvent e)
    {}

    public static void main(String [] args)
    {
        new PopMenu1();
    }
    
}
