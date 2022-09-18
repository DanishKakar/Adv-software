package SingletonDesignPattern;

public class Login {

    public void Goo(){
        
        Setting ob = Setting.createInstance();
        System.out.println(ob.getThems());
        
        
    }
}
