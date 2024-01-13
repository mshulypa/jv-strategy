package core.basesyntax.strategy.implementation;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscount implements DiscountService {

    @Override
    public double getDiscount() {
        return 0;
    }
}
