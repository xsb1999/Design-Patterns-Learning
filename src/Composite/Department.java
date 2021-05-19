package Composite;

public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    // 输出department
    @Override
    protected void print() {
        System.out.println(" "+getName()+" ");
    }
}
