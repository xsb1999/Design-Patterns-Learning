package Strategy;

public abstract class Duck {
    public Duck(){

    }

    public abstract void display();

    public void quack() {
        System.out.println("鸭子会叫");
    }

    public void fly(){
        System.out.println("鸭子会飞");
    }
    public void swim(){
        System.out.println("鸭子会游泳");
    }

}
