package Decorator;

public class Client {
    public static void main(String[] args) {
        // 装饰者模式下订单：2份巧克力+一份牛奶+long black
        // 1. 点一份long black
        Drink order = new LongBlack();
        System.out.println("费用1 = "+order.cost());
        System.out.println("描述： "+ order.getDescription());

        // 2. 加入一份牛奶
        order = new Milk(order);
        System.out.println("加入一份牛奶后的费用 = "+order.cost());
        System.out.println("描述： "+ order.getDescription());

        // 3. 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("加入一份巧克力后的费用 = "+order.cost());
        System.out.println("描述： "+ order.getDescription());

        // 4. 再加入一份巧克力
        order = new Chocolate(order);
        System.out.println("再加入一份巧克力后的费用 = "+order.cost());
        System.out.println("描述： "+ order.getDescription());

        // 全部加完了
        System.out.println("============================");
        System.out.println("最终费用 = "+order.cost());
        System.out.println("描述： "+ order.getDescription());

        // 点一份Decaf
        System.out.println("============================");
        Drink order2 = new Decaf();
        order2 = new Milk(order2);
        System.out.println("Decaf加一份牛奶： " + order2.cost());

    }
}
