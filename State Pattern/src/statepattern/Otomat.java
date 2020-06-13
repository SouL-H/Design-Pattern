// MEHMET https://github.com/SouL-H/
package statepattern;


public class Otomat {
    private OtomatDurum  otomatDurum;
    
    public Otomat(){
    otomatDurum = new IcecekSatildi(); 
    }
    public void IcekcekSatildi(){
    otomatDurum.icecekVer();
    }
    public void paraYok(){
    otomatDurum.paraAt();
    }
    public void paraAtildi(){
    otomatDurum.calis();
    }
    public void icecekYok(){
    otomatDurum.paraIadeEt();
    }
    public void suAnkiDurum(final OtomatDurum otomatDurum){
    this.otomatDurum = otomatDurum;
    
    }
    
    
    
    
    
}
