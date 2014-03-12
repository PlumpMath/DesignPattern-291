package proxy.virtualproxy;

import java.net.*;
import java.awt.*;
import javax.swing.*;

class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;
    State state;

    public ImageProxy(URL url) {
        imageURL = url;
        state = new ImageNotLoaded(this);
    }

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public URL getImageURL() {
        return imageURL;
    }

    //    public void paintIcon(final Component c, Graphics g, int x, int y) {
//        if (imageIcon != null) {
//            imageIcon.paintIcon(c, g, x, y);
//        } else {
//            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
//            if (!retrieving) {
//                retrieving = true;
//
//                retrievalThread = new Thread(new Runnable() {
//                    public void run() {
//                        try {
//                            imageIcon = new ImageIcon(imageURL, "CD Cover");
//                            c.repaint();
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                });
//                retrievalThread.start();
//            }
//        }
//    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        state.paint(c, g, x, y);
    }
}
