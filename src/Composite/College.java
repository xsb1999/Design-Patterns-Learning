package Composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    // list中存放的是department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();
    // 构造器
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 实际业务中college和department的add方法可能不一致
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    // 输出college包含的专业
    @Override
    protected void print() {
        System.out.println("---------"+getName()+"---------");
        for (OrganizationComponent o : this.organizationComponents) {
            o.print();
        }
    }
}
