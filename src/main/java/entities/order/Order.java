package entities.order;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@EqualsAndHashCode
public class Order {
    private final int id;
    private final int userId;
    private final OrderStatus orderStatus;
    private final List<entities.item.OrderItem> orderItems;
    private final LocalDate date;
    private final String deliveryAddress;

    public Order(int id, int userId, OrderStatus orderStatus, List<entities.item.OrderItem> orderItems, LocalDate date, String deliveryAddress) {
        this.id = id;
        this.userId = userId;
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
        this.date = date;
        this.deliveryAddress = deliveryAddress;
    }
}
