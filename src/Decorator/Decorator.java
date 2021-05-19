package Decorator;

public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice是自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " "+super.getPrice() + " "+ obj.getDescription();
    }
}
