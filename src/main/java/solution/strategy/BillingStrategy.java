package solution.strategy;

public interface BillingStrategy {
    Double getActPrice(Double rawPrice);

    static BillingStrategy normalStrategy() {
        return rawPrice -> rawPrice;
    }

    static BillingStrategy happyHourStrategy() {
        return rawPrice -> rawPrice / 2;
    }
}
