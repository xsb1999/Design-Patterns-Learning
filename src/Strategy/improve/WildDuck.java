package Strategy.improve;


public class WildDuck extends Duck {
    public WildDuck() {
        super(new GoodFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("我是野鸭");
    }
}
