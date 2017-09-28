package ChainResponsibility;

/**
 * Created by sourabh on 19/7/16.
 */
public class PurchaseRequest {
    private double amount;
    private String purpose;

    public PurchaseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amt) {
        amount = amt;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String reason) {
        purpose = reason;
    }
}
