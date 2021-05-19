package Factory;

import java.util.Observable;

public class Client {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("Tesla");
        System.out.println(car1.getName());

    }
}
