package JDK_src;

import java.util.Arrays;
import java.util.Comparator;

public class Strategy_Comparator {

    public static void main(String[] args) {
        Integer[] data1 = {9,1,2,8,4,3};

        /**
         * 说明：
         * 1. 实现了Comparator接口（类似于策略接口），创建了匿名类对象comparator
         * 2. 对象new Comparator<Integer>() {..} 就是实现了策略接口的具体策略对象(类似于GoodFly、BadFly、NoFly)
         * 3. public int compare(Integer o1, Integer o2){} 就是具体的实现方式，类似于鸭子中的fly()方法
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                }else {
                    return -1;
                }
            };
        };

        Arrays.sort(data1, comparator);
        System.out.println(Arrays.toString(data1));

        System.out.println("=========================");


        // lambda 表达式实现 (从大到小排序)
        Integer[] data2 = {19,11,12,18,14,13};
        Arrays.sort(data2, (var1, var2) -> {
            if (var1.compareTo(var2) > 0){
                return -1;
            }else {
                return 1;
            }
        });

        System.out.println(Arrays.toString(data2));
    }
}
