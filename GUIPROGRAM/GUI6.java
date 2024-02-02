import java.awt.event.*;
import javax.swing.*;

class GUI6 extends JFrame implements ActionListener
{
  JTextField first,sec,result;
  JButton sum,diff;
   public GUI6()
    {
     first=new JTextField();
     sec=new JTextField();
     result=new JTextField();
     setSize(800,1000);
     first.setBounds(200,100,400,100);
      sec.setBounds(200,300,400,100);
      result.setBounds(200,500,400,100);

      sum=new JButton("+");
      diff=new JButton("-");
      sum.setBounds(100,700,250,100); 
       diff.setBounds(450,700,250,100);  
       add(first);add(sec);add(result);add(sum);add(diff);
       setLayout(null);
       setVisible(true) ;
       result.setEditable(false);
       sum.addActionListener(this);
       diff.addActionListener(this);   
      }
      
      public void actionPerformed(ActionEvent e)
      {
      int a=Integer.parseInt(first.getText());
      int b=Integer.parseInt(sec.getText());
       if(e.getSource()==sum)
        {
        int ans=a+b;
        result.setText(" "+ans);
        }
       else
        {
        int ans=a-b;
        result.setText(" "+ans);
        }
       }
      public static void main(String [] args)
      {
       new GUI6(); 
      }
}