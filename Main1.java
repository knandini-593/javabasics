class device{
    String powerSource="on";
    void turnOn(){
    System.out.println("Device powered on");
}
}
class Mobile extends device{
    double screensize=6.5;
    void makeCall(){
        System.out.println("Making a call");
    }
}
class  Android extends Mobile{
    void openPlayStore(){
        System.out.println("Opening App store");
    }
}
class iPhone extends Mobile{
    void openAppStore(){
        System.out.println("Opening App store");
    }
    
}
public class Main1{
    public static void main(String[] args){
        Android a=new Android();
        System.out.println("Android:");
        a.turnOn();
        a.makeCall();
        a.openPlayStore();
        System.out.println();
        iPhone i=new iPhone();
        System.out.println("iPhone");
        i.turnOn();
        i.makeCall();
        i.openAppStore();
        
    }
    
}
