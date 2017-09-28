package Command;

/**
 * Created by sourabh on 19/7/16.
 */ //ConcreteCommand Class.
class SellStockOrder implements Order {
    private StockTrade stock;

    public SellStockOrder(StockTrade st) {
        stock = st;
    }

    public void execute() {
        stock.sell();
    }
}
