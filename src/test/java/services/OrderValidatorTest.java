package services;

import entities.Order;
import org.junit.jupiter.api.Test;

import static data.Data.anyInvalidOrder;
import static data.Data.anyValidOrder;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static services.OrderValidator.isValidOrder;

class OrderValidatorTest {

    @Test
    public void isValidOrder_valid() {
        Order order = anyValidOrder();

        assertTrue(isValidOrder(order));
    }

    @Test
    public void isValidOrder_invalid() {
        Order order = anyInvalidOrder();

        assertFalse(isValidOrder(order));
    }
}