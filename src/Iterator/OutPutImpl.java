package Iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    // 遍历所有学院，然后调用printDepartment输出各个学院的系
    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            // 获取college
            College college = iterator.next();
            System.out.println("====="+college.getName()+"=====");
            // 得到对应的迭代器
            Iterator iterator1 = college.createIterator();
            printDepartment(iterator1);
        }


    }

    // 输出: 学院输出系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }


}
