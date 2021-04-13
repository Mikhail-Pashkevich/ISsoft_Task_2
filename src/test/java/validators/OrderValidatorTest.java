package validators;

import entities.order.Order;
import org.junit.jupiter.api.Test;

import static data.OrderSamples.anyInvalidOrder_1;
import static data.OrderSamples.anyValidOrder_1;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static validators.OrderValidator.isValidOrder;

class OrderValidatorTest {
    @Test
    public void isValidOrder_valid() {
        Order order = anyValidOrder_1();

        assertTrue(isValidOrder(order));
    }

    @Test
    public void isValidOrder_invalid() {
        Order order = anyInvalidOrder_1();

        assertFalse(isValidOrder(order));
    }
}