package solution.decorator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeDecoratorTest {

    @Test
    public void simpleCoffee() {
        Coffee coffee = new SimpleCoffee();
        assertThat(coffee.getCost()).isEqualTo(1);
        assertThat(coffee.getIngredients()).isEqualTo("Coffee");
    }

    @Test
    public void withMilk() {
        Coffee coffee = new WithMilk(new SimpleCoffee());
        assertThat(coffee.getCost()).isEqualTo(1.5);
        assertThat(coffee.getIngredients()).isEqualTo("Coffee, Milk");
    }

    @Test
    public void withSprinkles() {
        Coffee coffee = new WithSprinkles(new SimpleCoffee());
        assertThat(coffee.getCost()).isEqualTo(1.2);
        assertThat(coffee.getIngredients()).isEqualTo("Coffee, Sprinkles");
    }

    @Test
    public void withMilkAndSprinkles() {
        Coffee coffee = new WithSprinkles(new WithMilk(new SimpleCoffee()));
        assertThat(coffee.getCost()).isEqualTo(1.7);
        assertThat(coffee.getIngredients()).isEqualTo("Coffee, Milk, Sprinkles");
    }

    @Test
    public void withSprinklesAndMilk() {
        Coffee coffee = new WithMilk(new WithSprinkles(new SimpleCoffee()));
        assertThat(coffee.getCost()).isEqualTo(1.7);
        assertThat(coffee.getIngredients()).isEqualTo("Coffee, Sprinkles, Milk");
    }
}
