package Strategy.improve;

public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        BJDuck bjDuck = new BJDuck();
        ToyDuck toyDuck = new ToyDuck();

        wildDuck.display();
        wildDuck.fly();
        System.out.println("==============");
        bjDuck.display();
        bjDuck.fly();
        System.out.println("==============");
        toyDuck.display();
        toyDuck.fly();
    }
}
