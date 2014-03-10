package templatemethod.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-10
 * Time: 上午9:18
 * To change this template use File | Settings | File Templates.
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Head First Design Patterns");
    }
}
