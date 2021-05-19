package JDK_src;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class Decorator_InputStream {
    public static void main(String[] args) throws Exception{
        // 说明：
        // FileInputStream = 被装饰者（咖啡）
        // DataInputStream = 装饰者（牛奶）
        // InputStream = Drink（抽象类)
        // FilterInputStream = Decorator
        // FilterInputStream中含有protected volatile InputStream，即包含装饰者
        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\TODO.md"));
        System.out.println(dis.read());
        dis.close();
    }
}
