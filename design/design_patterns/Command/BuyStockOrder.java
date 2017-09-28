package Command;

/**
 * Created by sourabh on 19/7/16.
 */ //ConcreteCommand Class.
class BuyStockOrder implements Order {
    private StockTrade stock;

    public BuyStockOrder(StockTrade st) {
        stock = st;
    }

    public void execute() {
        stock.buy();
    }
}
