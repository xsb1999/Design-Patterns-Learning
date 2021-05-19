package Memento.version1;


public class Client {
    public static void main(String[] args) {
        // 玩家1号
        System.out.println("玩家1号");
        Originator originator1 = new Originator(new State(100,80));
        originator1.add(new State(80,70));
        originator1.add(new State(50,65));
        System.out.println("攻击力："+originator1.getState().getAttack()+"--"+"防御力："+originator1.getState().getDefense());
        originator1.set(0);
        System.out.println("攻击力："+originator1.getState().getAttack()+"--"+"防御力："+originator1.getState().getDefense());

        System.out.println("======================================");

        // 玩家2号
        System.out.println("玩家2号");
        Originator originator2 = new Originator(new State(90,100));
        originator2.add(new State(75,95));
        originator2.add(new State(60,90));
        System.out.println("攻击力："+originator2.getState().getAttack()+"--"+"防御力："+originator2.getState().getDefense());
        originator2.set(0);
        System.out.println("攻击力："+originator2.getState().getAttack()+"--"+"防御力："+originator2.getState().getDefense());


    }
}
