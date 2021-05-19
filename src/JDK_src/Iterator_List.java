package JDK_src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 说明：
 * 1. ArrayList类的内部类Itr充当具体实现迭代器接口Iterator的类
 * 2. List充当了聚合接口，含有一个iterator()方法，返回一个Iterator对象
 * 3. ArrayList是实现List的子类，实现了iterator()方法
 * 4. LinkedList，ArrayList可以统一遍历
 */

public class Iterator_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        list.add("Jack");
        java.util.Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
