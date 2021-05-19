package Iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList; // 信息工程学院以list方式存放系
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index + 1 >= departmentList.size()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        index += 1;
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
