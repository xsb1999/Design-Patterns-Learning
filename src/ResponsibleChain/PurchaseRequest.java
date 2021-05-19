package ResponsibleChain;

public class PurchaseRequest {
    private float cost;

    public PurchaseRequest(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
