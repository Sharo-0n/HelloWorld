import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class HelloWorld extends JApplet {
    public void paint(Graphics g) {
        g.drawString("Hello world!", 50, 25);
    }
}
