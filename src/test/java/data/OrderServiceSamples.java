package data;

import services.OrderService;
import storages.OrderStorage;

import static data.OrderStorageSamples.anyValidOrderStorage;

public class OrderServiceSamples {
    public static OrderService emptyOrderService() {
        return new OrderService(new OrderStorage());
    }

    public static OrderService anyOrderService() {
        return new OrderService(anyValidOrderStorage());
    }
}