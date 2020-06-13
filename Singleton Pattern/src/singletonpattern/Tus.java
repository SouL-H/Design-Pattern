// MEHMET - https://github.com/soul-h
package singletonpattern;

import java.awt.event.*;


public class Tus extends KeyAdapter {

    static boolean w, s;

    @Override
    public void keyPressed(KeyEvent e) {

        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) {
            w = true;
        }
        if (id == KeyEvent.VK_S) {
            s = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
    }

}
