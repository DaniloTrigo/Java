package figures;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import ivisible.IVisible;


public abstract class Figure implements IVisible, Serializable {
    public int x, y;
    protected int w, h;
    protected int r,g,b;
    protected int rf,gf,bf;
    protected String texto;
    protected String fonte;
    protected int style;
    protected int t;

    public void criaFoco (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(this.x-1, this.y-1, this.w+2, this.h+3);
    }

    public boolean clicked (int x, int y) {
        return (this.x<=x && x<=this.x+this.w && this.y<=y && y<=this.y+this.h);
    }

    public void keyPressed(KeyEvent evt){
        switch (evt.getKeyCode()){
            case KeyEvent.VK_UP:{
                this.h+=5;
                break;
            }
            case KeyEvent.VK_DOWN:{
                if(this.h>=1){
                    this.h-=3;
                }
                break;
            }
            case KeyEvent.VK_RIGHT:{
                this.w+=5;
                break;
            }
            case KeyEvent.VK_LEFT:{
                if (this.w>=1){
                    this.w-=3;
                }
                break;
        
            }
            case KeyEvent.VK_1:{ 
                this.rf = 255;
                this.gf = 0;
                this.bf = 0;
                break;
            }
            case KeyEvent.VK_2:{ 
                this.rf = 0;
                this.gf = 255;
                this.bf = 0;
                break;
            }
            case KeyEvent.VK_3:{ 
                this.rf = 0;
                this.gf = 0;
                this.bf = 255;
                break;
            }
            case KeyEvent.VK_4:{ 
                this.rf = 255;
                this.gf = 255;
                this.bf = 0;
                break;
            }
            case KeyEvent.VK_5:{ 
                this.rf = 255;
                this.gf = 255;
                this.bf = 255;
                break;
            }
            case KeyEvent.VK_6:{ 
                this.rf = 0;
                this.gf = 0;
                this.bf = 0;
                break;
            }
            case KeyEvent.VK_NUMPAD1:{ 
                this.r = 255;
                this.g = 0;
                this.b = 0;
                break;
            }
            case KeyEvent.VK_NUMPAD2:{ 
                this.r = 0;
                this.g = 255;
                this.b = 0;
                break;
            }
            case KeyEvent.VK_NUMPAD3:{ 
                this.r = 0;
                this.g = 0;
                this.b = 255;
                break;
            }
            case KeyEvent.VK_NUMPAD4:{ 
                this.r = 255;
                this.g = 255;
                this.b = 0;
                break;
            }
            case KeyEvent.VK_NUMPAD5:{ 
                this.r = 255;
                this.g = 255;
                this.b = 255;
                break;
            }
            case KeyEvent.VK_NUMPAD6:{ 
                this.r = 0;
                this.g = 0;
                this.b = 0;
                break;
            }
        }
    }

    public void paint(Graphics g2, boolean c) {
    }

   
}