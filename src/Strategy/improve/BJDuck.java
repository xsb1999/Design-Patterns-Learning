package Strategy.improve;

public class BJDuck extends Duck {

    public BJDuck() {
        super(new BadFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("我是北京鸭");
    }

}
