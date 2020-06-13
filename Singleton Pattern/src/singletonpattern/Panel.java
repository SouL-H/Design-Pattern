// MEHMET - https://github.com/soul-h
package singletonpattern;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class Panel extends JPanel {

    Top Top = new Top(0, 0);
    Engel r1 = new Engel(10, 200);

    public Panel() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.YELLOW);
        dibujar(g2);
        actualizar();
    }

    public void dibujar(Graphics2D g) {
        g.fill(Top.getTop());
        g.fill(r1.getEngel());
    }

    public void actualizar() {
        Top.mover(getBounds(),colision(r1.getEngel()));
        r1.moverR1(getBounds());
    }
    
    private boolean colision(Rectangle2D r){
        return Top.getTop().intersects(r);
    }
    

}
