// MEHMET https://github.com/SouL-H/

package templatepattern;


public class Musteri {
     public static void main( final String[] args ) {

    final Icecek[] icecekler = new Icecek[3];
    icecekler[0] = new Cay();
    icecekler[1] = new Kahve();
    icecekler[2] = new Oralet();


    for ( final Icecek dongu : icecekler ) {
      dongu.IcecekYap();
    }
  }
}
