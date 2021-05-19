package ResponsibleChain;

public abstract class Approver {
    Approver successor;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public void processRequest(PurchaseRequest request){}
}
