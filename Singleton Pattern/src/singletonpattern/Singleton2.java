// MEHMET - https://github.com/soul-h
package singletonpattern;


public class Singleton2 {
     
    private static Singleton2 singleton2 = new Singleton2();
    

    private Singleton2(){
            game2();
    }
 
    public static Singleton2 getInstance() {
        return singleton2;
    }
    
    public void game2(){
        Pencere pencere = new Pencere();
 
    }
}
