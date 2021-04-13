package entities.item;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class OrderItem {
    private final int id;
    private final String name;
    private final int quantity;
    private final double cost;

    public OrderItem(int id, String name, int quantity, double cost) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }
}
