import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  class Card extends JFrame implements ActionListener
   {
    JButton a,b,c,d;
    Container ctn;
    CardLayout card;
    
    public Card()
      {
       ctn=getContentPane();
       card=new CardLayout();
       ctn.setLayout(card);
       
       a=new JButton("A");
       b=new JButton("B");
       c=new JButton("C");
       d=new JButton("D");

       ctn.add("first",a);
       ctn.add("second",b);
       ctn.add("third",c);
       ctn.add("fourth",d);

       a.addActionListener(this);
       b.addActionListener(this);
       c.addActionListener(this);
       d.addActionListener(this);
       
       setSize(400,500);
       setVisible(true);

      }

      public void actionPerformed(ActionEvent e)
      {
       if(e.getSource()==b)
       {
        card.last(ctn); 
       }
       else if(e.getSource()==d)
       {
        card.previous(ctn);
       }
       else if(e.getSource()==c)
       {
        card.first(ctn);
       }
       else
       {
        card.next(ctn);
       }
      }
      
      public static void main(String [] args)
      {
       new Card();
      }
   }