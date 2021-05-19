package Singleton;

public class Singleton_lanhanshi {
    private Singleton_lanhanshi(){}
    private static Singleton_lanhanshi instance;
    public static Singleton_lanhanshi getInstance(){
        if (instance == null){
            instance = new Singleton_lanhanshi();
        }
        return instance;
    }
}
