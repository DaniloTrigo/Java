package Figures;

import java.awt.*;

public class RectRedon extends Figure{

    public RectRedon (int x, int y, int w, int h, int r, int g, int b, int rf, int gf, int bf) {
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
    
    public void paint (Graphics g, boolean focado) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(this.rf, this.gf, this.bf));
        g2d.fillRoundRect(this.x, this.y, this.w, this.h, 30, 10);
        g2d.setColor(new Color(this.r, this.g, this.b));
        g2d.drawRoundRect(this.x,this.y, this.w,this.h, 30, 10);
    }
}