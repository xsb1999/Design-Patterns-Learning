package ResponsibleChain;

public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getCost() > 30000){
            System.out.println("SchoolMasterApprover");
        }else {
            successor.processRequest(request);
        }
    }
}
