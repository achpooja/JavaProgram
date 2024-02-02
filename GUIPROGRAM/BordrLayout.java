import java.awt.*;

 class BordrLayout extends Frame
  {
   public BordrLayout()
    {
     setSize(400,500);
     
     Button n=new Button("North");
     Button s=new Button("South");
     Button e=new Button("East");
     Button w=new Button("West");
     Button c=new Button("Center");
     setLayout(new BorderLayout(20,25));
     add(n,BorderLayout.NORTH);
     add(s,BorderLayout.SOUTH);
     add(e,BorderLayout.EAST);
     add(w,BorderLayout.WEST);
     add(c);
     setVisible(true);
    }
    public static void main(String [] args)
    {
     new BordrLayout();
    }
  }