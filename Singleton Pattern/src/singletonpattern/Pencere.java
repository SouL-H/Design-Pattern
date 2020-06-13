// MEHMET - https://github.com/soul-h
package singletonpattern;


import javax.swing.JFrame;


public class Pencere extends JFrame {

    private final int genislik = 500, yükseklik = 500;
    private Panel lamina;
    private Grv Grv;
    public Pencere() {
        setTitle("Pong");
        setSize(genislik, yükseklik);
        setLocationRelativeTo(null); 
        setResizable(false);
        lamina = new Panel();
        add(lamina);
        addKeyListener(new Tus());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Grv=new Grv(lamina);
        Grv.start();
        
    }
}
