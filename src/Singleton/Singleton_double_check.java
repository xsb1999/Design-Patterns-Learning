package Singleton;

public class Singleton_double_check {
    private Singleton_double_check(){}
    private static volatile Singleton_double_check instance;

    // 加入双重检查代码
    public static Singleton_double_check getInstance(){
        if (instance == null){
            synchronized (Singleton_double_check.class){
                if (instance == null){
                    instance = new Singleton_double_check();
                }
            }

        }
        return instance;
    }

}
