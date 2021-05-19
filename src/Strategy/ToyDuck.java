package Strategy;

public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是玩具鸭");
    }
    // 需要重写父类的所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫");
    }
    @Override
    public void fly(){
        System.out.println("玩具鸭不会飞");
    }
    @Override
    public void swim(){
        System.out.println("玩具鸭不会游泳");
    }
}
