package Memento.version2;

/**
 * version1的不足之处：
 * Originator类中有一个属性state_list，如果Originator特别多，则state_list就会特别多，导致开销大
 * 因此可以将state_list放到一个别的类中，并可以只维护一个state_list（比如前10个是第1个Originator的，接下来10个是第2个Originator的...）
 */

public class Originator {
    private State currentState;

    public State getCurrentState() {
        return currentState;
    }
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    // 保存一个状态对象到一个Memento中
    public Memento saveStateMemento() {
        return new Memento(currentState);
    }
    // 通过备忘录对象恢复状态
    public void getStateFromMemento(Memento memento) {
        currentState = memento.getState();
    }



}
