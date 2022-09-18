package SingletonDesignPattern;

public class Dashboard {
    
    public void foo(){
        
        Setting ob = Setting.createInstance();
        ob.SetThems("Light Mode!");
        System.out.println(ob.getThems()); 
        
    }
}
