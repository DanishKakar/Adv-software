
package adv_software_01;

public class Main {

    public static void main(String[] args) {
       Quackbehavior maller = new SQuack();
       FlyBehavior mallerd  = new FlyWithWings();
   
       maller.quack();
       mallerd.fly();
    }   
}
