import javax.swing.*;
import java.awt.*;


public class BarDiagram extends JFrame {
    final int [] data={50,70,100,30};
    final int frameHeight=800;
    final int frameWidth=800;
    final int barWidth=30;

    public BarDiagram()
    {
        setSize(frameHeight, frameWidth);
        setVisible(true);


    }

    public int getMax()
    {
        int max = 0;
        for(int i:data)
        {
            if(i>max)
            {
                max=i;
            }
        }
        return max;
    }

    public int[] transformData()
    {
        int [] bd=new int[data.length];
        int maxHeight=700;
        int max=getMax();
        for(int i=0;i<data.length;i++)
        {
            bd[i]=Math.round((maxHeight*data[i]/max));
        }
        return bd;
    }

    public void paint(Graphics g)
    {
        Color [] colors ={Color.RED,Color.GREEN,Color.BLUE,Color.PINK};
        int []t=transformData();
        for(int i=0;i<t.length;i++)
        {
            g.setColor(colors[i]);
            g.fillRect(i*barWidth,frameHeight-t[i],barWidth,t[i]);
        }

    }
    public static void main(String[] args)
    {
        new BarDiagram();
    }
    
}
