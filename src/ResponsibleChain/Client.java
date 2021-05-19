package ResponsibleChain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request1 = new PurchaseRequest(3000);
        PurchaseRequest request2 = new PurchaseRequest(8000);
        PurchaseRequest request3 = new PurchaseRequest(15000);
        PurchaseRequest request4 = new PurchaseRequest(50000);

        Approver department = new DepartmentApprover("Department");
        Approver college = new CollegeApprover("College");
        Approver viceSchoolMaster = new ViceSchoolMasterApprover("ViceSchoolMaster");
        Approver schoolMaster = new SchoolMasterApprover("SchoolMaster");

        // 设置“继任者”
        department.setSuccessor(college);
        college.setSuccessor(viceSchoolMaster);
        viceSchoolMaster.setSuccessor(schoolMaster);
        schoolMaster.setSuccessor(department);

        // 开始 (从viceSchoolMaster开始)
        System.out.println("3000元：");
        viceSchoolMaster.processRequest(request1);
        System.out.println("========================");
        System.out.println("8000元：");
        viceSchoolMaster.processRequest(request2);
        System.out.println("========================");
        System.out.println("15000元：");
        viceSchoolMaster.processRequest(request3);
        System.out.println("========================");
        System.out.println("50000元：");
        viceSchoolMaster.processRequest(request4);
        System.out.println("========================");
    }
}
