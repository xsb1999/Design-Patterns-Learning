package Memento.version2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 用HashMap来维护多个玩家（Originator）
public class CareTakerForMultiple {
    private Map<Originator, ArrayList<Memento>> listHashMap = new HashMap<>();

    public void init(Originator originator) {
        listHashMap.put(originator, new ArrayList<Memento>());
    }

    public void add(Originator originator, Memento memento) {
        listHashMap.get(originator).add(memento);
    }
    public Memento get(Originator originator, int index) {
        return listHashMap.get(originator).get(index);
    }

}
