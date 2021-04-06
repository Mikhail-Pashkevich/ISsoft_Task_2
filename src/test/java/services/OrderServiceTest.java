package services;

import entities.Order;
import org.junit.jupiter.api.Test;

import static data.Data.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    @Test
    public void placeOrder_valid() {
        Order order = anyValidOrder();
        OrderService orderService = emptyOrderService();

        assertTrue(orderService.placeOrder(order));
    }

    @Test
    public void placeOrder_invalid() {
        Order order = anyInvalidOrder();
        OrderService orderService = emptyOrderService();

        assertFalse(orderService.placeOrder(order));
    }

    // red test
    @Test
    public void write_valid() {
        OrderService orderService = emptyOrderService();

        assertTrue(orderService.write(somePath));
    }

    @Test
    public void write_invalid() {
        OrderService orderService = emptyOrderService();

        assertThrows(UnsupportedOperationException.class, () -> orderService.write(somePath));
    }
}