package Iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        // 创建学院
        ArrayList<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        colleges.add(computerCollege);
        colleges.add(infoCollege);

        // 增加系
        computerCollege.addDepartment("Java", "Java");
        computerCollege.addDepartment("C", "C");
        computerCollege.addDepartment("Python", "Python");
        infoCollege.addDepartment("操作系统", "操作系统");
        infoCollege.addDepartment("计网", "计网");

        // 遍历输出结果
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();

    }
}
