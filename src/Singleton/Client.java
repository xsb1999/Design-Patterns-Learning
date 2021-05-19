package Singleton;

public class Client {
    public static void main(String[] args) {
        System.out.println("饿汉式，不能lazy Loading，线程安全，可以使用");
        Singleton_ehanshi s1 = Singleton_ehanshi.getInstance();
        Singleton_ehanshi s2 = Singleton_ehanshi.getInstance();
        System.out.println(s1 == s2);
        System.out.println("懒汉式，能lazy Loading，线程不安全，不能使用");
        Singleton_lanhanshi s3 = Singleton_lanhanshi.getInstance();
        Singleton_lanhanshi s4 = Singleton_lanhanshi.getInstance();
        System.out.println(s3 == s4);
        System.out.println("懒汉式2，能lazy Loading，线程安全，但是每次都要同步，效率太低，不推荐使用");
        Singleton_lanhanshi2 s5 = Singleton_lanhanshi2.getInstance();
        Singleton_lanhanshi2 s6 = Singleton_lanhanshi2.getInstance();
        System.out.println(s5 == s6);
        System.out.println("双重检查，能lazy Loading，线程安全，不需要每次都同步，推荐使用");
        Singleton_double_check s7 = Singleton_double_check.getInstance();
        Singleton_double_check s8 = Singleton_double_check.getInstance();
        System.out.println(s7 == s8);
        System.out.println("静态内部类，能lazy Loading，线程安全，不需要每次都同步，推荐使用");
        Singleton_static_inner_class s9 = Singleton_static_inner_class.getInstance();
        Singleton_static_inner_class s10 = Singleton_static_inner_class.getInstance();
        System.out.println(s9 == s10);
        System.out.println("枚举，能lazy Loading，线程安全，不需要每次都同步，推荐使用");
        Singleton_enum s11 = Singleton_enum.instance;
        Singleton_enum s12 = Singleton_enum.instance;
        System.out.println(s11 == s12);
    }
}
