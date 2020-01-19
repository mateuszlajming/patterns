package solution.strategy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyTest {

    @Test
    public void test() {
        Customer customer = new Customer(BillingStrategy.normalStrategy());

        // standard prices
        customer.add(10.0, 2);

        // happy hour
        customer.setStrategy(BillingStrategy.happyHourStrategy());
        customer.add(10.0, 2);

        assertThat(customer.getTheBill()).isEqualTo(30.0);
    }
}
