package Decorator;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDescription("Soy");
        setPrice(1.5f);
    }
}
