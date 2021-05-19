package Decorator;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDescription("Milk");
        setPrice(2.0f);
    }
}
