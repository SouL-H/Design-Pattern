// MEHMET https://github.com/SouL-H/

package templatepattern;


public abstract class Icecek {

  public void IcecekYap() {
    malzemeleriKoy();
    suyuKaynat();
    servisYap();
  }

  protected abstract void malzemeleriKoy();

  protected abstract void suyuKaynat();

  protected abstract void servisYap();
}
