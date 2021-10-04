import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import figures.*;

public class Window extends JPanel {
    private static final long serialVersionUID = 1L;
    private ArrayList<Figure> figs = new ArrayList<Figure>();
    private Figure focus;
    private int mouseX;
    private int mouseY;
    private int mX;
    private int mY;
    private Texto Comandos1 = new Texto("R: Retangulo   E: Elipse  T: Triangulo Equilatero Y: Retangulo arredondado", "Arial", 0, 10, 435, 15, 0, 0, 255, 255, 0);
    private Texto Comandos2 = new Texto("1-Vermelho   2-Verde   3-Azul   4-Amarelo   5-Branco   6-Preto", "Arial", 0, 10, 450, 15, 0, 0, 255, 255, 0);
    private Texto Comandos3 = new Texto("Redimensionar(Cima/Direita aumentam e Baixo/Esquerda diminuem) TAB=Foco", "Arial", 0, 10, 465, 15, 0, 0, 255, 255, 0);
    
    Window(){
    
    setFocusable(true);
    setDoubleBuffered(true);
    setFocusTraversalKeysEnabled(false);
    

    this.addKeyListener (
        new KeyAdapter(){
            public void keyPressed (KeyEvent evt) {
                    int x = mX;
                    int y = mY;
                    int w = 50;
                    int h = 50;
                    int r = 255;
                    int g = 255;
                    int b = 255;
                    int rf = 0;
                    int gf = 0;
                    int bf = 0;
                if (evt.getKeyCode() == KeyEvent.VK_R) {
                    figs.add(new Rect(x,y, w,h, r,g,b, rf,gf,bf));
                    focus = figs.get(figs.size()-1);
                    repaint();
                }
                if (evt.getKeyCode() == KeyEvent.VK_E) {
                    figs.add(new Ellipse(x,y, w,h, r,g,b, rf,gf,bf));
                    focus = figs.get(figs.size()-1);
                    repaint();
                }
                if (evt.getKeyCode() == KeyEvent.VK_Y){
                    figs.add(new RectRedon(x, y, w, h, r, g, b, rf, gf, bf));
                    focus = figs.get(figs.size()-1);
                    repaint();
                }
                if (evt.getKeyCode() == KeyEvent.VK_T) {
                    figs.add(new Triang(x, y, w, h, r, g, b, rf, gf, bf));
                    focus = figs.get(figs.size()-1);
                    repaint();
                }
                if (evt.getKeyChar() == KeyEvent.VK_TAB) {
                    for (Figure fig: figs) {
                        if (focus != fig){
                            focus=fig;
                            figs.remove(fig);
                            figs.add(fig);
                            repaint();
                            break;
                        }
                    }
                }

                if (focus!=null){
                    if (evt.getKeyCode() >= 32 && evt.getKeyCode() < 127 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                        focus.keyPressed(evt);
                        repaint();
                    }
                }

            }
        }
    );
    this.addMouseListener (
        new MouseAdapter()
        {
            public void mousePressed(MouseEvent evt)
            {
                mouseX = evt.getX();
                mouseY = evt.getY();
                focus = null;
                for (Figure fig: figs)
                {
                    if (fig.clicked(mouseX, mouseY))
                    {
                        focus = fig;
                        figs.remove(fig);
                        figs.add(fig);
                        repaint();
                        break;
                    }
                    else
                    {
                        focus = null;
                        repaint();
                    }
                }

                }
            }
    );

    this.addMouseMotionListener(
        new MouseMotionAdapter()
        {    
            public void mouseMoved(MouseEvent e)
            {
                mX = e.getX();
                mY = e.getY();
            }
            public void mouseDragged(MouseEvent e)
            {   
                if(focus!=null){
                    focus.x=e.getX();
                    focus.y=e.getY();
                    repaint();
                }
            }
        }
    );
}   
public void paint (Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(Color.BLACK);
    g2d.fillRect(0, 0, 2000, 1500);
    Comandos1.paint(g, true);
    Comandos2.paint(g, true);
    Comandos3.paint(g, true);
    for (Figure fig: figs) {
        fig.paint(g,true);
    }
    if (focus!=null){
        g2d.setColor(Color.BLUE);
        focus.criaFoco(g);
    }
}
}