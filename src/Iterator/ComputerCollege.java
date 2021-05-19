package Iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        if (numOfDepartment >= 5){
            return;
        }
        departments[numOfDepartment] = new Department(name, desc);
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
