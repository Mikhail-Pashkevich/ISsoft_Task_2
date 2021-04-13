package storages;

import entities.order.Order;
import entities.order.OrderStatus;
import handlers.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class OrderStorage {
    private final List<Order> orders;

    public OrderStorage() {
        this.orders = new ArrayList<>();
    }

    public void add(Order order) {
        this.orders.add(order);
    }

    public void remove(Order order) {
        this.orders.remove(order);
    }

    public Order get(int index) {
        return this.orders.get(index);
    }

    public int size() {
        return this.orders.size();
    }

    public Order findByOrderId(int orderId) {
        for (Order order : this.orders) {
            if (order.getId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public Order findByUserId(int userId) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public Order findByStatus(OrderStatus orderStatus) {
        throw new UnsupportedOperationException("not implemented yet");
    }
    // TODO: and another find methods

    public String read(String path) {
        return FileHandler.readFromFile(path);
    }

    public boolean write(String path) {
        throw new UnsupportedOperationException("not implemented yet");
        // TODO: create with FileHandler.writeToFile(String path, String message);
    }
}