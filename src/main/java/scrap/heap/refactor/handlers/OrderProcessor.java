package scrap.heap.refactor.handlers;

import scrap.heap.refactor.builders.BalloonBuilder;
import scrap.heap.refactor.builders.CakeBuilder;
import scrap.heap.refactor.domain.*;

public class OrderProcessor {
  public boolean buildAndPlaceOrder() {
    boolean orderConfirmation = false;

    try {
      new BalloonBuilder()
          .setBalloonColor(Colors.RED)
          .setMaterial(Material.MYLAR)
          .setNumber(4)
          .createBalloon()
          .placeOrder();

      new CakeBuilder()
          .setFlavor(Flavors.CHOCOLATE)
          .setFrostingFlavor(Flavors.CHOCOLATE)
          .setShape(Shapes.CIRCLE)
          .setSize(Sizes.SMALL)
          .setCakeColor(Colors.BROWN)
          .createCake()
          .placeOrder();

      new BalloonBuilder()
          .setBalloonColor(Colors.BLUE)
          .setMaterial(Material.LATEX)
          .setNumber(7)
          .createBalloon();
      new CakeBuilder()
          .setFlavor(Flavors.VANILLA)
          .setFrostingFlavor(Flavors.CHOCOLATE)
          .setShape(Shapes.SQUARE)
          .setSize(Sizes.MED)
          .setCakeColor(Colors.BROWN)
          .createCake()
          .placeOrder();

      new BalloonBuilder()
          .setBalloonColor(Colors.YELLOW)
          .setMaterial(Material.MYLAR)
          .setNumber(4)
          .createBalloon()
          .placeOrder();

      new CakeBuilder()
          .setFlavor(Flavors.VANILLA)
          .setFrostingFlavor(Flavors.VANILLA)
          .setShape(Shapes.SQUARE)
          .setSize(Sizes.SMALL)
          .setCakeColor(Colors.YELLOW)
          .createCake();

      orderConfirmation = true;
    } catch (Exception e) {
      System.out.println("Failed to place order" + e.getMessage());
    }
    return orderConfirmation;
  }
}
