package JDK_src;

import java.util.Observable;
import java.util.Observer;

public class Observers_Observable {
    public static void main(String[] args) {

        /**
         * Observable的作用等同于观察者模式中的Subject
         * Observable是类，不是接口，类中已经实现了核心方法（增加、删除观察者，notify）
         * Observer的作用等同于观察者模式中的Observer，是接口
         */

        Observable observable = new Observable();
        Observer observer;
    }
}
