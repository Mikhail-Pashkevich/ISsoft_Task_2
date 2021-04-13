package data;

import entities.order.Order;
import entities.order.OrderStatus;

import java.time.LocalDate;
import java.util.Arrays;

import static data.OrderItemSamples.anyValidOrderItem_1;
import static data.OrderItemSamples.anyValidOrderItem_2;

public class OrderSamples {
    public static String somePath = "test.txt";

    public static Order anyValidOrder_1() {
        return new Order(
                1,
                1,
                OrderStatus.ACTIVE,
                Arrays.asList(
                        anyValidOrderItem_1(),
                        anyValidOrderItem_2()),
                LocalDate.of(2021, 4, 6),
                "some address");
    }

    public static Order anyValidOrder_2() {
        return new Order(
                2,
                1,
                OrderStatus.ACTIVE,
                Arrays.asList(
                        anyValidOrderItem_1(),
                        anyValidOrderItem_2()),
                LocalDate.of(2021, 4, 6),
                "some address");
    }

    public static Order anyInvalidOrder_1() {
        return new Order(
                -1,
                1,
                OrderStatus.ACTIVE,
                Arrays.asList(
                        anyValidOrderItem_1(),
                        anyValidOrderItem_2()),
                LocalDate.of(2021, 4, 6),
                "some address");
    }
}
