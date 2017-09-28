package ChainResponsibility;

/**
 * Created by sourabh on 19/7/16.
 */
abstract public class PurchasePower {
    protected static final int BASE = 500;
    protected PurchasePower successor;

    abstract protected int getAllowable();

    abstract protected String getRole();

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}

class ManagerPPower extends PurchasePower {

    protected int getAllowable() {
        return BASE * 10;
    }

    protected String getRole() {
        return "Manager";
    }
}

class DirectorPPower extends PurchasePower {

    protected int getAllowable() {
        return BASE * 20;
    }

    protected String getRole() {
        return "Director";
    }
}

class VicePresidentPPower extends PurchasePower {

    protected int getAllowable() {
        return BASE * 40;
    }

    protected String getRole() {
        return "Vice President";
    }
}

class PresidentPPower extends PurchasePower {

    protected int getAllowable() {
        return BASE * 60;
    }

    protected String getRole() {
        return "President";
    }
}
