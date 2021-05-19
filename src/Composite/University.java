package Composite;

import java.util.ArrayList;
import java.util.List;

// 就是Composite，可以管理College
public class University extends OrganizationComponent {
    // list中存放的是college
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    // 构造器
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    // 输出university包含的学院
    @Override
    protected void print() {
        System.out.println("---------"+getName()+"---------");
        for (OrganizationComponent o : this.organizationComponents) {
            o.print();
        }
    }
}
