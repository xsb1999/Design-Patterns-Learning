package Singleton;

public class Singleton_lanhanshi2 {
    private Singleton_lanhanshi2(){}
    private static Singleton_lanhanshi2 instance;
    // 加入synchronized，使各个线程依次执行getInstance方法，避免线程不安全问题导致打破单例模式
    public static synchronized Singleton_lanhanshi2 getInstance(){
        if (instance == null){
            instance = new Singleton_lanhanshi2();
        }
        return instance;
    }
}
