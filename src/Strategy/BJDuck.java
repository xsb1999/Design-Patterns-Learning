package Strategy;

public class BJDuck extends Duck {

    @Override
    public void display() {
        System.out.println("我是北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不能飞");
    }
}
