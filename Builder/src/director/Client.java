package director;

import concretebuilder.FastFoodOrderBuilder;
import product.order.BankAccount;
import product.order.Order;
import product.type.BreadType;
import product.type.OrderType;
import product.type.SauceType;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Order order = new FastFoodOrderBuilder()
                    .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                    .orderSauce(SauceType.SOY_SAUCE).build();
            System.out.println(order);
        }
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("GP Coder", "0123456789")
                .withEmail("contact@gpcoder.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}
