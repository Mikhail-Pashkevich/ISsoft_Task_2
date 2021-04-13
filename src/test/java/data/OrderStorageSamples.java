package data;

import storages.OrderStorage;

import static data.OrderSamples.anyValidOrder_1;
import static data.OrderSamples.anyValidOrder_2;

public class OrderStorageSamples {
    public static OrderStorage emptyOrderStorage() {
        return new OrderStorage();
    }

    public static OrderStorage anyValidOrderStorage() {
        OrderStorage storage = emptyOrderStorage();

        storage.add(anyValidOrder_1());
        storage.add(anyValidOrder_2());

        return storage;
    }
}
