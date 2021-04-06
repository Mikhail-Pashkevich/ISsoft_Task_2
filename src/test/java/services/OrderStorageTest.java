package services;

import org.junit.jupiter.api.Test;

import static data.Data.anyValidOrder;
import static data.Data.emptyOrderService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class OrderStorageTest {
    @Test
    public void findByOrderId_valid() {
        OrderService orderService = emptyOrderService();
        orderService.placeOrder(anyValidOrder());

        assertFalse(orderService.findByOrderId(1).isEmpty());
        assertEquals(orderService.findByOrderId(1).get(0).getId(), 1);
    }
}