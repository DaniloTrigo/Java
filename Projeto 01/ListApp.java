import java.awt.*;
import javax.swing.*;

class ListApp {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
   
    ListFrame () {
        
        add(new Window());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Projeto 01");
        this.setSize(720, 520);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);  
        }
        
}