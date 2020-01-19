package solution.facade;

public class OrderFacadeDemo {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade(new Kitchen(), new Waiter());
        orderFacade.orderFood();
    }
}
