package validators;

import entities.order.Order;

public class OrderValidator {
    public static boolean isValidOrder(Order order) {
        if (order.getId() < 0) {
            return false;
        }
        if (order.getDeliveryAddress().isEmpty()) {
            return false;
        }
        if (order.getOrderItems().size() == 0) {
            return false;
        }
        return true;
    }
}
