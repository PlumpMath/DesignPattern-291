package proxy.virtualproxy;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-11
 * Time: 下午10:23
 * To change this template use File | Settings | File Templates.
 */
public class ImageLoaded implements State {
    ImageProxy proxy;

    public ImageLoaded(ImageProxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public void paint(Component c, Graphics g, int x, int y) {
        this.proxy.getImageIcon().paintIcon(c, g, x, y);
    }
}
