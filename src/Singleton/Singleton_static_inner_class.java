package Singleton;

public class Singleton_static_inner_class {
    private Singleton_static_inner_class (){}
    // 写一个静态内部类，该类中有一个静态属性-Singleton_static_inner_class
    private static class SingletonInstance {
        private static final Singleton_static_inner_class instance = new Singleton_static_inner_class();
    }
    public static Singleton_static_inner_class getInstance(){
        return SingletonInstance.instance;
    }


}
