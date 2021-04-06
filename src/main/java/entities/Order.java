package entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@EqualsAndHashCode
public class Order {
    private int id;
    private int userId;
    private Status status;
    private List<OrderItem> orderItems;
    private LocalDate date;
    private String deliveryAddress;

    public Order(int id, int userId, Status status, List<OrderItem> orderItems, LocalDate date, String deliveryAddress) {
        this.id = id;
        this.userId = userId;
        this.status = status;
        this.orderItems = orderItems;
        this.date = date;
        this.deliveryAddress = deliveryAddress;
    }
}
