package Memento.version2;

public class ClientForMultiple {
    public static void main(String[] args) {

        CareTakerForMultiple careTaker = new CareTakerForMultiple();

        // 玩家1号
        Originator originator1 = new Originator();
        careTaker.init(originator1);
        originator1.setCurrentState(new State(100, 70));
        careTaker.add(originator1, originator1.saveStateMemento());
        originator1.setCurrentState(new State(90, 60));
        careTaker.add(originator1, originator1.saveStateMemento());
        originator1.setCurrentState(new State(80, 30));
        careTaker.add(originator1, originator1.saveStateMemento());

        System.out.println("玩家1号");
        // 当前状态
        System.out.println("当前状态");
        System.out.println(originator1.getCurrentState());

        // 恢复到状态1
        System.out.println("恢复到状态1");
        originator1.getStateFromMemento(careTaker.get(originator1, 0));
        System.out.println(originator1.getCurrentState());

        System.out.println("=============================");

        // 玩家2号
        Originator originator2 = new Originator();
        careTaker.init(originator2);
        originator2.setCurrentState(new State(60, 100));
        careTaker.add(originator2, originator2.saveStateMemento());
        originator2.setCurrentState(new State(40, 98));
        careTaker.add(originator2, originator2.saveStateMemento());
        originator2.setCurrentState(new State(10, 97));
        careTaker.add(originator2, originator2.saveStateMemento());

        System.out.println("玩家2号");
        // 当前状态
        System.out.println("当前状态");
        System.out.println(originator2.getCurrentState());

        // 恢复到状态1
        System.out.println("恢复到状态1");
        originator2.getStateFromMemento(careTaker.get(originator2, 0));
        System.out.println(originator2.getCurrentState());
    }

}
