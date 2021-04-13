package storages;

import org.junit.jupiter.api.Test;

import static data.OrderSamples.anyValidOrder_1;
import static data.OrderSamples.anyValidOrder_2;
import static data.OrderStorageSamples.anyValidOrderStorage;
import static data.OrderStorageSamples.emptyOrderStorage;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderStorageTest {
    private OrderStorage orderStorage;

    @Test
    void add_valid() {
        orderStorage = emptyOrderStorage();

        orderStorage.add(anyValidOrder_1());

        assertEquals(orderStorage.get(0), anyValidOrder_1());
    }

    @Test
    void remove_valid() {
        orderStorage = anyValidOrderStorage();

        orderStorage.remove(anyValidOrder_2());

        assertEquals(orderStorage.get(0), anyValidOrder_1());
    }

    @Test
    public void get() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Test
    public void size() {
        orderStorage = anyValidOrderStorage();

        assertEquals(2, orderStorage.size());
    }

    @Test
    public void findByOrderId_valid() {
        orderStorage = anyValidOrderStorage();

        assertEquals(anyValidOrder_1(), orderStorage.findByUserId(1));
    }

    @Test
    void findByUserId() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Test
    void findByStatus() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Test
    void read() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Test
    void write() {
        throw new UnsupportedOperationException("not implemented yet");
    }
}