import javax.swing.*;
import java.awt.event.*;
public class MenuExample extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu file,edit;
    JMenuItem sa,copy,cut,paste;
    JTextArea ta;

    MenuExample(){
        sa= new JMenuItem("SelectALl");
        copy= new JMenuItem("copy");
        cut= new JMenuItem("cut");
        paste= new JMenuItem("paste");

        sa.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);

        mb = new JMenuBar();
        file= new JMenu("file");
        edit= new JMenu("edit");

        mb.add(file);
        mb.add(edit);

        edit.add(sa);
        edit.add(copy);
        edit.add(paste);
        edit.add(cut);

        ta= new JTextArea();
        ta.setBounds(5,5,360,320);


        setJMenuBar(mb);
        setSize(400,500);
        setVisible(true);
        setLayout(null);
        add(ta);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==sa)
            ta.selectAll();

        if(e.getSource()==copy)
        ta.copy();

        if(e.getSource()==paste)
        ta.paste();

        if(e.getSource()==cut)
            ta.cut();

        }


        public static void main(String[] args){
            new MenuExample();
        }
    }
