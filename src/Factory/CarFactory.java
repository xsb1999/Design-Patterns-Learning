package Factory;

public class CarFactory {
    public static Car getCar(String car){
        if (car.equals("Tesla")){
            return new Tesla();
        }else if (car.equals("Dazhong")){
            return new Dazhong();
        }else {
            return null;
        }
    }



}
