// MEHMET - https://github.com/soul-h
package singletonpattern;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


public class Top {

    private int x;
    private int y;
    private int dx = 1, dy = 1;
    private final int genislik = 20, yükseklik = 20;

    public Top(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getTop() {
        return new Rectangle2D.Double(x, y, genislik, yükseklik);
    }

    public void mover(Rectangle limites, boolean colisionR1) {
        x += dx;
        y += dy;
        
        if(colisionR1){
            dx=-dx;
            x=25;
        }
        if (x > limites.getMaxX()) {
            dx = -dx;
        }
        if (y > limites.getMaxY()) {
            dy = -dy;
        }
        if (x < 0) {
            dx = -dx;
        }
        if (y < 0) {
            dy = -dy;
        }
    }
}
