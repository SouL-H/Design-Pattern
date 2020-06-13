// MEHMET https://github.com/SouL-H/
package statepattern;


public class ParaYok implements OtomatDurum{

    @Override
    public void paraAt() {
        System.out.println("Para Atıldı.");
    }

    @Override
    public void paraIadeEt() {
        System.out.println("Para iade edildi.");
    }

    @Override
    public void calis() {
       System.out.println("Otomat çalışıyor.");   
    }
    

    @Override
    public void icecekVer() {
       System.out.println("İçecek veriliyor...");
    }
    
}
