package services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import storages.OrderStorage;

import static data.OrderSamples.anyValidOrder_1;
import static data.OrderServiceSamples.anyOrderService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;

class OrderServiceTest {
    private OrderService orderService;
    private OrderStorage orderStorage;

    @BeforeEach
    public void before() {
        this.orderStorage = mock(OrderStorage.class);

        this.orderService = new OrderService(this.orderStorage);
    }

    @Test
    void someLogic_valid() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Test
    void placeOrder_valid() {
        orderService.placeOrder(anyValidOrder_1());

        assertEquals(orderStorage.get(0), anyValidOrder_1());
    }

    @Test
    void findByOrderId() {
        orderService = anyOrderService();

        assertNotEquals(null, orderService.findByOrderId(1));
    }
}