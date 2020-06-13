// MEHMET https://github.com/SouL-H/

package templatepattern;


public class Cay extends Icecek {

  @Override
  protected void malzemeleriKoy() {
    System.out.println( "Çay demliğe koyuldu." );
  }

  @Override
  protected void suyuKaynat() {
    System.out.println( "Su kaynadı , çay demlendi." );
  }

  @Override
  protected void servisYap() {
    System.out.println( "Çay servisi yapıldı." );
  }
}
