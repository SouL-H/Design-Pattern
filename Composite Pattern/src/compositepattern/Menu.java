// MEHMET https://github.com/SouL-H/


package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Garson{
    
   private final List<Garson>  menuBilesenleri  = new ArrayList<>();


  @Override
  public void yazdir() {

    for ( final Garson Cocuk : menuBilesenleri ) {
      Cocuk.yazdir();
    }
  }

  public void ekle( final Garson menuComponent ) {
    menuBilesenleri.add(menuComponent);
  }

  public void cikar( final Garson menuComponent ) {
    menuBilesenleri.remove(menuComponent);
  }
}
