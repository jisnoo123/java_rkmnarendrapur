//<applet code = "SimpleApplet" width=500 height=500></applet>
import java.awt.*;
import java.applet.*;

public class SimpleApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("A simple applet", 20, 20);
    }
}