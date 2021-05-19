package Memento.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * version1的不足之处：
 * Originator类中有一个属性state_list，如果Originator特别多，则state_list就会特别多，导致开销大
 * 因此可以将state_list放到一个别的类中，并可以只维护一个state_list（比如前10个是第1个Originator的，接下来10个是第2个Originator的...）
 */

public class Originator {
    private State state;
    private List<State> state_list = new ArrayList<>();

    public Originator(State state) {
        this.state = state;
        state_list.add(state);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<State> getState_list() {
        return state_list;
    }

    public void setState_list(List<State> state_list) {
        this.state_list = state_list;
    }

    public void add(State state) {
        state_list.add(state);
        this.state = state;
    }
    public void set (int index) {
        this.state = state_list.get(index);
    }

}
