package Memento.version2;

public class Client {
    public static void main(String[] args) {
        Originator originator1 = new Originator();
        CareTaker careTaker1 = new CareTaker();
        originator1.setCurrentState(new State(100, 70));
        careTaker1.add(originator1.saveStateMemento());
        originator1.setCurrentState(new State(90, 60));
        careTaker1.add(originator1.saveStateMemento());
        originator1.setCurrentState(new State(80, 50));
        careTaker1.add(originator1.saveStateMemento());
        // 当前状态
        System.out.println("当前状态");
        System.out.println(originator1.getCurrentState());

        // 恢复到状态1
        System.out.println("恢复到状态1");
        originator1.getStateFromMemento(careTaker1.get(0));
        System.out.println(originator1.getCurrentState());

    }



}
