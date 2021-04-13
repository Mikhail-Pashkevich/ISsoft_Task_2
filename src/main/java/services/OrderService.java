package services;

import entities.order.Order;
import storages.OrderStorage;

import static validators.OrderValidator.isValidOrder;

public class OrderService {
    private OrderStorage orderStorage;

    public OrderService(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    public void someLogic() {
        throw new UnsupportedOperationException("do some logic later");
    }

    public boolean placeOrder(Order order) {
        if (isValidOrder(order)) {
            orderStorage.add(order);
            return true;
        }
        return false;
    }

    public Order findByOrderId(int orderId) {
        return orderStorage.findByOrderId(orderId);
    }
}
