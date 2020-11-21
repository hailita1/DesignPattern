package builder;

import product.order.Order;
import product.type.BreadType;
import product.type.OrderType;
import product.type.SauceType;
import product.type.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
