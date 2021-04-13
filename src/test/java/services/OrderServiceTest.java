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


//class OrderServiceTest {
//    @Test
//    public void placeOrder_valid() {
//        Order order = anyValidOrder();
//        OrderService orderService = emptyOrderService();
//
//        assertTrue(orderService.placeOrder(order));
//    }
//
//    @Test
//    public void placeOrder_invalid() {
//        Order order = anyInvalidOrder();
//        OrderService orderService = emptyOrderService();
//
//        assertFalse(orderService.placeOrder(order));
//    }
//
//    // red test, error
//    @Test
//    public void write_valid() {
//        OrderService orderService = emptyOrderService();
//
//        assertTrue(orderService.write(somePath));
//    }
//
//    @Test
//    public void write_invalid() {
//        OrderService orderService = emptyOrderService();
//
//        assertThrows(UnsupportedOperationException.class, () -> orderService.write(somePath));
//    }
//}