package Strategy.improve;

public class ToyDuck extends Duck {
    public ToyDuck() {
        super(new NoFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("我是玩具鸭");
    }

}
