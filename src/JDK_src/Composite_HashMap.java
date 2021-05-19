package JDK_src;

import java.util.HashMap;
import java.util.Map;

/**
 * 说明：
 * 1. Map就是一个抽象的构件儿（类似我们的Component）
 * 2. HashMap是一个中间的构件儿，实现/继承了相关方法（put, putAll） 【类似于学校或者学院】
 * 3. Node是HashMap的一个静态内部类,类似leaf节点，没有put, putAll方法  【类似于专业】
 */

public class Composite_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "西游记");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "红楼梦");
        map.put(2, "水浒传");

        hashMap.putAll(map);

        System.out.println(hashMap);

    }
}
