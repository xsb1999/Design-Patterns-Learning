package Iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    // 这里我们需要知道department是以怎样的方式存放
    // departments是从ComputerCollege类中传递过来的，达成了数据共享
    Department[] departments;
    int position = -1;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position + 1 >= departments.length || departments[position + 1] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        position += 1;
        Department department = departments[position];
        return department;
    }

    @Override
    public void remove() {

    }
}
