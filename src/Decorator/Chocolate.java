package Decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDescription("Chocolate");
        setPrice(3.0f);
    }
}
