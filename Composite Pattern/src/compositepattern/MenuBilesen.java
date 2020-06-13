// MEHMET https://github.com/SouL-H/


package compositepattern;


public class MenuBilesen {
   public static void main( final String[] args ) {

    
    final MenuOgesi menuComponent1 = new MenuOgesi( "Menu1","Coca-Cola", "İçecek",15.0 );
    final MenuOgesi menuComponent2 = new MenuOgesi( "Menu1","Pepsi", "İçecek",15.0 );
    final MenuOgesi menuComponent3 = new MenuOgesi( "Menu1","Fanta", "İçecek",15.0 );
    final MenuOgesi menuComponent4 = new MenuOgesi( "Menu2","Çikolata", "Yiyecek",15.0 );
    final MenuOgesi menuComponent5 = new MenuOgesi( "Menu2","Cips", "Yiyecek",15.0 );
    final Menu Menu1 = new Menu();
    final Menu Menu2 = new Menu();
    final Menu Menu = new Menu();

    Menu1.ekle( menuComponent1 );
    Menu1.ekle( menuComponent2 );
    Menu1.ekle( menuComponent3 );

    Menu2.ekle( menuComponent4 );
    Menu2.ekle( menuComponent5 );

    Menu.ekle( Menu1 );
    Menu.ekle( Menu2 );

    Menu.yazdir();

}
}