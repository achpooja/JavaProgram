import javax.swing.*;
import java.awt.event.*;

class PopMenu extends JFrame implements MouseListener,ActionListener
 {
  JPopupMenu menu;
  JMenuItem sa,copy,paste,cut,exit;
  JTextArea area;
  
   public PopMenu()
    {
    setSize(400,500);
    menu=new JPopupMenu("Menu");
     add(menu);
    sa=new JMenuItem("Select All");
    menu.add(sa);
    copy=new JMenuItem("Copy");
    menu.add(copy);
    cut=new JMenuItem("Cut");
    menu.add(cut);
    paste=new JMenuItem("Paste");
    menu.add(paste);
    exit=new JMenuItem("Exit");
    menu.add(exit);
    area=new JTextArea("Here");
    area.setBounds(100,100,300,300);
    add(area);
    addMouseListener(this);
    setLayout(null);
    setVisible(true);

     sa.addActionListener(this);
     copy.addActionListener(this);
     cut.addActionListener(this);
     paste.addActionListener(this);
     exit.addActionListener(this);
    
    
    }
    
   public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==sa)
       {
       area.selectAll();
       }

       else if(e.getSource()==copy)
       {
       area.copy();
       }
     
       else if(e.getSource()==cut)
       {
       area.cut();
       }
      
       else if(e.getSource()==paste)
       {
       area.paste();
       }
       else
       {
       System.exit(0);
       }
     
     
    }
   public void mouseClicked(MouseEvent e)
      {
        menu.show(this,e.getX(),e.getY());
      }
      public  void mouseEntered(MouseEvent e)
      {}
      public  void mouseExited(MouseEvent e)
      {}
      public  void mousePressed(MouseEvent e)
      {}
      public void mouseReleased(MouseEvent e)
      {} 


   public static void main(String [] args)
   {
   new PopMenu();
   }
 }