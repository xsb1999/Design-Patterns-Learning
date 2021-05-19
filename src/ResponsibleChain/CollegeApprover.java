package ResponsibleChain;

public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getCost() <= 10000 && request.getCost() > 5000){
            System.out.println("CollegeApprover");
        }else {
            successor.processRequest(request);
        }
    }
}
