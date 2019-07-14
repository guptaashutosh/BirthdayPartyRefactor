package scrap.heap.refactor.handlers;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderProcessorTest {

    @Test
    public void buildAndPlaceOrder() {
        OrderProcessor processor = new OrderProcessor();

        boolean orderConfirmation = processor.buildAndPlaceOrder();
        assertTrue("Order confirmation should be successful.", orderConfirmation);
    }
}
