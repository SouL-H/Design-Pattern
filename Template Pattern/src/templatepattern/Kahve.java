// MEHMET https://github.com/SouL-H/

package templatepattern;


public class Kahve extends Icecek {

  @Override
  protected void malzemeleriKoy() {
    System.out.println( "Kahve bardağa koyuldu.." );
  }

  @Override
  protected void suyuKaynat() {
    System.out.println( "Su kaynatıldı ve bardağa döküldü." );
  }

  @Override
  protected void servisYap() {
    System.out.println( "Kahve servisi yapıldı." );
  }
}
