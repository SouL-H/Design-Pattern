// MEHMET - https://github.com/soul-h
package singletonpattern;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Grv extends Thread {

    private final Panel lamina;
 
    public Grv(Panel lamina) {
        this.lamina = lamina;
    }

    @Override
    public void run() {
        while (true) {
            lamina.repaint();
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Grv.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
    }
}
