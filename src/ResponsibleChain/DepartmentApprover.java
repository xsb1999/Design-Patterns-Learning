package ResponsibleChain;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getCost() <= 5000){
            System.out.println("DepartmentApprover");
        }else {
            successor.processRequest(request);
        }
    }
}
