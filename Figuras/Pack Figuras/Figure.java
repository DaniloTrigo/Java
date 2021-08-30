package Figuras;

import java.awt.Graphics;

public abstract class Figure {
    int x, y;
    int r,g,b;
    String texto;
    String fonte;
    int style;
    int t;
    public abstract void paint (Graphics g);
}