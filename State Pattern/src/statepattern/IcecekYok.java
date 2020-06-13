// MEHMET https://github.com/SouL-H/
package statepattern;

public class IcecekYok implements OtomatDurum {

    public void paraAt() {
        System.out.println("Para Atıldı.");
    }

    public void paraIadeEt() {
        System.out.println("Para iade edildi.");
    }

    public void calis() {
       System.out.println("Otomat çalışıyor.");   
    }
    

    @Override
    public void icecekVer() {
       System.out.println("İçecek veriliyor...");
    }
    
}
