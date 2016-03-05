import javax.swing.*;
import java.awt.*;
public class Example18 {
    public static void main(String[]args)
    {
        Frame18 f = new Frame18();
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class Frame18 extends JFrame
{
    public Frame18()
    {
        setTitle("18 rocks!");
        setSize(300, 200);
        setLocation(100, 200);
        
        Panel18 panel = new Panel18();
        Container cp = getContentPane();
        cp.add(panel);
    }
}
class Panel18 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Hi", 75, 100);
    }
}