package ResponsibleChain;

public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getCost() <= 30000 && request.getCost() > 10000){
            System.out.println("ViceSchoolMasterApprover");
        }else {
            successor.processRequest(request);
        }
    }
}
