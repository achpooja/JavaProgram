import javax.swing.*;

class GUI8 extends JFrame
 {
  JMenu file,edit,n;
  JMenuItem save,exit,java;
  JMenuBar bar;
   public GUI8()
    {
    setSize(400,500);
    bar=new JMenuBar();
    setJMenuBar(bar);
    JMenu file=new JMenu("File");
    bar.add(file);
    JMenu edit=new JMenu("Edit");
    bar.add(edit);
    n=new JMenu("New");
    file.add(n);
    save=new JMenuItem("Save");
    file.add(save);
    file.addSeparator();
    exit=new JMenuItem("Exit");
    file.add(exit);
    java=new JMenuItem("Java");
    n.add(java);
    setLayout(null);
    setVisible(true);
    }
    
   public static void main(String [] args)
   {
   new GUI8();
   }
 }