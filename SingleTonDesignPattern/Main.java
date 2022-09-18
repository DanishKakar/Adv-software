import Beverage.Darkrost;
import Beverage.Milk;
import Coffee.Espress;
import Coffee.McCoffee;
import SingletonDesignPattern.Dashboard;
import SingletonDesignPattern.Login;

public class Main {

    public static void main(String[] args) {
        System.out.println("Danish!!");

        // open , close design principle And decorator design pattern
        Espress e = new Espress();
        Darkrost d = new Darkrost(e);

        // System.out.println("DarkRost Coffe : "+d.cost());

        // McCoffee m = new McCoffee();
        // Milk milk = new Milk(m);

        // System.out.println("Milk Coffe : "+ milk.cost());

        /// Singleton Design Pattern 

        
        Login log = new Login();
        Dashboard dsh = new Dashboard();
        log.Goo();
        dsh.foo();


    }
}