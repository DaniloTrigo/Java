import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RectApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect retangulo1;
    Rect retangulo2;
    Rect retangulo3;
    Rect retangulo4;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Desenhando Retangulos");
        this.setSize(350, 350);
        this.retangulo1 = new Rect(100,100, 100,50, 0, 0 ,0, 50, 100, 70);
        this.retangulo2 = new Rect(150,50, 30,100, 100, 100 ,100, 200, 200, 30);
        this.retangulo3 = new Rect(50,80, 150,30, 200, 30 ,70, 20, 50, 150);
        this.retangulo4 = new Rect(80,110, 110,60, 30, 150 ,20, 250, 150, 40);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.retangulo1.paint(g);
        this.retangulo2.paint(g);
        this.retangulo3.paint(g);
        this.retangulo4.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    int a, b, c;
    int af, bf, cf;

    Rect (int x, int y, int w, int h, int a, int b, int c, int af, int bf, int cf) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.af = af;
        this.bf = bf;
        this.cf = cf;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(this.a, this.b, this.c));
        g2d.drawRect(this.x,this.y, this.w,this.h);
        g2d.setColor(new Color(this.af, this.bf, this.cf));
        g2d.fillRect(this.x+1, this.y+1, this.w-1, this.h-1);
    }
    int area() {
        return this.w * this.h;
    }
    void drag(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }  
}