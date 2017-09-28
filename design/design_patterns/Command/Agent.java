package Command;

import java.util.LinkedList;

/**
 * Created by sourabh on 19/7/16.
 */ // Invoker.
class Agent {
    private LinkedList ordersQueue = new LinkedList<Order>();

    public Agent() {
    }

    void placeOrder(Order order) {
        ordersQueue.addLast(order);
        ((Order) ordersQueue.poll()).execute();
    }
}
