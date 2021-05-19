package Singleton;

public class Singleton_ehanshi {
    private Singleton_ehanshi(){

    }
    private static Singleton_ehanshi instance = new Singleton_ehanshi();

    public static Singleton_ehanshi getInstance() {
        return instance;
    }
}
