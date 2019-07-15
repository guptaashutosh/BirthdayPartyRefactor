package scrap.heap.refactor.handlers;

import org.junit.Test;
import scrap.heap.refactor.domain.constants.Constants;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class OrderProcessorTest {

    @Test
    public void testBuildAndPlaceOrder() {
        OrderProcessor processor = new OrderProcessor();
        Map<String, String[]> orderMap = new HashMap<>();

        orderMap.put(Constants.BALLON_KEY, new String[]{"RED", "mylar", "6"});
        orderMap.put(
                Constants.CAKE_KEY, new String[]{"CHOCOLATE", "CHOCOLATE", "CIRCLE", "SMALL", "BROWN"});
        boolean orderConfirmation = processor.buildAndOrder(orderMap);
        assertTrue("Order confirmation should be successful.", orderConfirmation);
    }
}
