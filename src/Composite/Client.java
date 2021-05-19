package Composite;

public class Client {
    public static void main(String[] args) {

        // 创建学校
        OrganizationComponent university = new University("清华大学", "大学");
        // 创建学院
        OrganizationComponent college1 = new College("计算机学院", "计算机学院");
        OrganizationComponent college2 = new College("软件学院", "软件学院");
        // 创建专业
        OrganizationComponent department_cs1 = new Department("电子", "电子");
        OrganizationComponent department_cs2 = new Department("物联网", "物联网");
        OrganizationComponent department_sw1 = new Department("软件工程", "nb");
        OrganizationComponent department_sw2 = new Department("信息安全", "nb");
        OrganizationComponent department_sw3= new Department("数媒", "nb");
        // 把学院加入学校
        university.add(college1);
        university.add(college2);
        // 把专业加入学院
        college1.add(department_cs1);
        college1.add(department_cs2);
        college2.add(department_sw1);
        college2.add(department_sw2);
        college2.add(department_sw3);

        // 测试一下
        university.print();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        college1.print();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        college2.print();

    }
}
