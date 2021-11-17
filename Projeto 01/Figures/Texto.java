package Figures;

import java.awt.*;


public class Texto extends Figure {
    private String texto;
    private String fonte;
    private int style;
    public int t;

    public Texto (String texto, String fonte, int style, int x, int y, int t, int w, int h, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.t = t;
        this.texto = texto;
        this.fonte = fonte;
        this.style = style;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void paint (Graphics g, boolean focado) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font(fonte, style, t));
        g2d.setPaint(new Color(this.r, this.g, this.b));
        g2d.drawString(this.texto, this.x, this.y);
        FontMetrics metrics = g.getFontMetrics();
        this.h= metrics.getHeight();
        this.w = metrics.stringWidth(texto);
    }
}