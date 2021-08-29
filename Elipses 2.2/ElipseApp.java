
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

class ElipseApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Ellipse elip1;
    Ellipse elip2;
    Ellipse elip3;
    Ellipse elip4;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("4 elipses");
        this.setSize(350, 350);
        this.elip1 = new Ellipse(50,250, 150, 200, 50, 100, 0, 250, 10, 10);
        this.elip2 = new Ellipse(200,300, 100, 100, 10, 30, 200, 200, 10, 60);
        this.elip3 = new Ellipse(220,250, 45, 35, 0, 100, 100, 0, 40, 50);
        this.elip4 = new Ellipse(100,140, 35, 35, 0, 115, 0, 100, 100, 40);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.elip1.paint(g);
        this.elip2.paint(g);
        this.elip3.paint(g);
        this.elip4.paint(g);
    }
}

class Ellipse {
    int x, y;
    int w, h;
    int r, g, b;
    int rf, gf, bf;

    Ellipse (int x, int y, int w, int h, int r, int g, int b, int rf, int gf, int bf) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.r = r;
        this.g = g;
        this.b = b;
        this.rf = rf;
        this.gf = gf;
        this.bf = bf;
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(this.r, this.g, this.b));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        g2d.setColor(new Color(this.rf, this.gf, this.bf));
        g2d.fillOval(this.x, this.y, this.w, this.h);
    }
}