// MEHMET https://github.com/SouL-H/


package compositepattern;


public class MenuOgesi implements Garson {
    
  private final String  isim;
  private final String  bilgi;
  private final String  menuAdi;
  private final double  fiyat;


  public MenuOgesi( final String menuAdi , final String isim, final String bilgi, final double fiyat) {
    this.isim = isim;
    this.bilgi = bilgi;
    this.fiyat = fiyat;
    this.menuAdi = menuAdi;
  }
  

  public void yazdir() {
    System.out.println( "Menü Adı: " + menuAdi + ", İsim: " + isim + ", MenuBilgisi: " + bilgi + ", Fiyatı: " + fiyat );
  }
}
    
