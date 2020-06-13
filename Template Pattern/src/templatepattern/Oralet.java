// MEHMET https://github.com/SouL-H/
package templatepattern;


public class Oralet extends Icecek {

  @Override
  protected void malzemeleriKoy() {
    System.out.println( "Oralet bardağa koyuldu." );
  }

  @Override
  protected void suyuKaynat() {
    System.out.println( "Su kaynatıldı , bardağa koyuldu." );
  }

  @Override
  protected void servisYap() {
    System.out.println( "Oralet servisi yapıldı." );
  }
}
