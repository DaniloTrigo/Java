
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import Figuras.Elipse;
import Figuras.Retangulo;


class Main {
    public static void main (String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}

class MainFrame extends JFrame {
    Elipse e1;
    Retangulo r1;

    MainFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.setTitle("Elipse,Retangulo e Texto");
        this.setSize(350, 350);
        this.r1 = new Retangulo(100,100, 100,50, 0, 0 ,0, 50, 100, 70);
        this.e1 = new Elipse(50,250, 150, 200, 50, 100, 0, 250, 10, 10);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
    }
}