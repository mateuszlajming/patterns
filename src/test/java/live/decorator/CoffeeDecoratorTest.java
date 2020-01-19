package live.decorator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeDecoratorTest {

    @Test
    public void test_simpleCoffee() {
        Coffee coffee = new SimpleCoffee();

        assertThat(coffee.getCost()).isEqualTo(1);
        assertThat(coffee.getIngredients()).isEqualTo("Coffee");
    }

    @Test
    public void test_simpleCoffee_withMilk() {
        Coffee coffee = new SimpleCoffee();

        coffee = new WithMilk(coffee);

        assertThat(coffee.getCost()).isEqualTo(1.5);
        assertThat(coffee.getIngredients()).isEqualTo("Coffee, Milk");
    }
}