// MEHMET - https://github.com/soul-h
package singletonpattern;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


public class Engel {

    private int x, y;
    static final int genislik = 20, yükseklik = 130;

    public Engel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getEngel() {
        return new Rectangle2D.Double(x, y, genislik, yükseklik);
    }

    public void moverR1(Rectangle limites) {
        if (Tus.w && y > limites.getMinY()) {
            y--;
        }
        if (Tus.s && y < limites.getMaxY()-yükseklik) {
            y++;
        }
    }
}
