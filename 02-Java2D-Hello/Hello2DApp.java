import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.getContentPane().setBackground(Color.BLACK);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.RED);
        int[] xPoints = {50,100,150,200,250,300,350};
        int[] yPoints = {350,250,275,200,275,150,100};
        int nPoints = xPoints.length;

        g2d.setStroke(new BasicStroke(2));
        g2d.drawPolyline(xPoints, yPoints, nPoints);

        g2d.setFont(new Font("Comic Sans",Font.ITALIC,15));
        g2d.setColor(Color.RED);
        g2d.drawString("STONKS",150,150);

        g2d.setPaint(new Color(150,250,150));
        g2d.fillArc(50,50,50,50,350,350);
        g2d.drawString("PACMAN",100,100);

    }
}