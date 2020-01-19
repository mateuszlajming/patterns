package solution.strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final List<Double> drinkPrices = new ArrayList<>();
    private BillingStrategy strategy;

    public Customer(BillingStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(Double price, int quantity) {
        this.drinkPrices.add(this.strategy.getActPrice(price*quantity));
    }

    public Double getTheBill() {
        Double sum = this.drinkPrices.stream().mapToDouble(v -> v).sum();
        this.drinkPrices.clear();
        return sum;
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
}
