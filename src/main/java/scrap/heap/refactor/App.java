package scrap.heap.refactor;

import scrap.heap.refactor.handlers.OrderProcessor;

public class App {
  public static void main(String[] args) {

    OrderProcessor orderProcessor = new OrderProcessor();
    if (orderProcessor.buildAndPlaceOrder()) {
      System.out.println("Hurray!!! LendUp has confirmed your order.");
    } else {
      System.out.println("Uff!!! Order got declined due to some technical difficulty.");
    }
  }

  public String getGreeting() {
    return "Hello world.";
  }
}
