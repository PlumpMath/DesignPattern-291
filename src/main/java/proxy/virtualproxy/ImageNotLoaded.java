package proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-11
 * Time: 下午10:23
 * To change this template use File | Settings | File Templates.
 */
public class ImageNotLoaded implements State {
    ImageProxy proxy;

    public ImageNotLoaded(ImageProxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public void paint(final Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
        new Thread(new Runnable() {
            public void run() {
                try {
                    ImageIcon imageIcon = new ImageIcon(ImageNotLoaded.this.proxy.getImageURL(), "CD Cover");
                    ImageNotLoaded.this.proxy.setImageIcon(imageIcon);
                    System.out.println("downloaded");
                    ImageNotLoaded.this.proxy.setState(new ImageLoaded(ImageNotLoaded.this.proxy));
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
