package services;

import entities.Order;

import java.util.List;

import static services.OrderValidator.isValidOrder;

public class OrderService {
    private OrderStorage orderStorage = OrderStorage.emptyStorage();

    public String orderToStringForWrite(Order order) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public String read(String path) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public boolean write(String path) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public boolean placeOrder(Order order) {
        if (isValidOrder(order)) {
            orderStorage.addOrder(order);
            return true;
        }
        return false;
    }

    public List<Order> findByOrderId(int orderId) {
        return orderStorage.findByOrderId(orderId);
    }
}
