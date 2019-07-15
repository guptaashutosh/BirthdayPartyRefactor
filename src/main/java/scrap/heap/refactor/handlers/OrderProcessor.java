package scrap.heap.refactor.handlers;

import scrap.heap.refactor.domain.Balloon;
import scrap.heap.refactor.domain.Cake;
import scrap.heap.refactor.domain.constants.*;

import java.util.Map;

public class OrderProcessor {

    public boolean buildAndOrder(Map<String, String[]> orderVO) {
    boolean orderConfirmation = false;
        String[] cakeOptions = orderVO.get(Constants.CAKE_KEY);
        String[] balloonOptions = orderVO.get(Constants.BALLON_KEY);
    try {
        new Balloon.BalloonBuilder()
                .setBalloonColor(Colors.valueOf(balloonOptions[0]))
                .setMaterial(Material.fromString(balloonOptions[1]))
                .setNumber(Integer.parseInt(balloonOptions[2]))
          .createBalloon()
          .placeOrder();

        new Cake.CakeBuilder()
                .setFlavor(Flavors.valueOf(cakeOptions[0]))
                .setFrostingFlavor(Flavors.valueOf(cakeOptions[1]))
                .setShape(Shapes.valueOf(cakeOptions[2]))
                .setSize(Sizes.valueOf(cakeOptions[3]))
                .setCakeColor(Colors.valueOf(cakeOptions[4]))
          .createCake()
          .placeOrder();

      orderConfirmation = true;
    } catch (Exception e) {
      System.out.println("Failed to place order" + e.getMessage());
    }
    return orderConfirmation;
  }
}
