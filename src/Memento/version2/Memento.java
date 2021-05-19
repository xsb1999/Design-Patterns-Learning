package Memento.version2;

public class Memento {
    State state;

    public Memento(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }



}
