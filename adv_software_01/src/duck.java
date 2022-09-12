
package adv_software_01;

public abstract class duck {
    FlyWithWings flybehiver;
    Quckbehiver quckbehiver;
    public  void performQuck() {
        quckbehiver.quck();
    }
    public void pperformFly() {
        flybehiver.fly();
    }   
    public abstract void display();
    public void swim() {
        System.out.println("All duck flat, even decoys");
    }
}
