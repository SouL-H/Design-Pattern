// MEHMET https://github.com/SouL-H
package strategypattern;


public class Context {
    private Communicate communicate;
   
    public void setCommunicate(Communicate communicate) {
        this.communicate = communicate;
    }
    public void sendInformation(){
        communicate.send();
    }
}
