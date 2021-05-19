package Strategy.improve;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public abstract void display();

    public void fly(){
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
