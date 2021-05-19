package Strategy.improve;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我飞的一般");
    }
}
