import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;

 class Login implements ActionListener
  {
    JFrame login,db;
     JButton signin;
     JTextField uname;
     JPasswordField upass;
     JLabel label;

     public Login()
      {
       login=new JFrame("Login");
       uname=new JTextField();
       upass=new JPasswordField();
       signin=new JButton("Signin");

       login.add(uname);
       login.add(upass);
       login.add(signin);

       login.setLayout(new BoxLayout(login.getContentPane(),BoxLayout.Y_AXIS));
       login.pack();
       login.setVisible(true);
       login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       signin.addActionListener(this); 
      }

     public void actionPerformed(ActionEvent e)
     {
      String username=uname.getText();
      String password=String.valueOf(upass.getPassword());

          if(username.equals("ncit")&&password.equals("123"))
           {
            showDashBoard(username);
           }
           else 
           {
           JOptionPane.showMessageDialog(login,"Invalid Credentials","login",JOptionPane.ERROR_MESSAGE);
            }
       }
       public void showDashBoard(String name)
       {
        db=new JFrame("DashBoard");
         db.setSize(200,300);
        label=new JLabel(name);
         db.add(label);
        login.dispose();
        db.setVisible(true);
       }

      public static void main(String [] args)
      {
       new Login(); 
      } 
  }