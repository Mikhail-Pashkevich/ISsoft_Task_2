package data;

import entities.Order;
import entities.OrderItem;
import entities.Status;
import services.OrderService;

import java.time.LocalDate;
import java.util.Arrays;

public class Data {
    public static String somePath = "test.txt";

    public static Order anyValidOrder() {
        return new Order(
                1,
                1,
                Status.ACTIVE,
                Arrays.asList(
                        new OrderItem(1, "item 1", 1, 1),
                        new OrderItem(2, "item 2", 1, 1)),
                LocalDate.of(2021, 4, 6),
                "some address");
    }

    public static Order anyInvalidOrder() {
        return new Order(
                -1,
                1,
                Status.ACTIVE,
                Arrays.asList(
                        new OrderItem(1, "item 1", 1, 1),
                        new OrderItem(2, "item 2", 1, 1)),
                LocalDate.of(2021, 4, 6),
                "some address");
    }

    public static OrderService emptyOrderService() {
        return new OrderService();
    }
}
