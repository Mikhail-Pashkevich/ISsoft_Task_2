package services;

import entities.Order;
import entities.Status;

import java.util.ArrayList;
import java.util.List;

public class OrderStorage {
    private final List<Order> orders;

    private OrderStorage() {
        orders = new ArrayList<>();
    }

    public static OrderStorage emptyStorage() {
        return new OrderStorage();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order removeLastOrder() {
        Order order = orders.get(orders.size() - 1);
        orders.remove(order);
        return order;
    }

    public List<Order> findByOrderId(int orderId) {
        List<Order> newOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getId() == orderId) {
                newOrders.add(order);
            }
        }
        return newOrders;
    }

    public List<Order> findByUserId(int userId) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public List<Order> findByStatus(Status status) {
        throw new UnsupportedOperationException("not implemented yet");
    }
    // TODO: and another find methods
}
