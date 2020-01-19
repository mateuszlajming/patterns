package solution.facade;

public class OrderFacade {
    private final Kitchen kitchen;
    private final Waiter waiter;

    public OrderFacade(Kitchen kitchen, Waiter waiter) {
        this.kitchen = kitchen;
        this.waiter = waiter;
    }

    public void orderFood() {
        waiter.writeOrder();
        waiter.sendOrderToTheKitchen();
        kitchen.prepareFood();
        kitchen.callWaiter();
    }
}
