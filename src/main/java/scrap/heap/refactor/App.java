package scrap.heap.refactor;

import org.apache.commons.cli.ParseException;
import scrap.heap.refactor.handlers.CommandLineProcessor;
import scrap.heap.refactor.handlers.OrderProcessor;

import java.io.IOException;
import java.util.Map;

public class App {
  public static void main(String[] args) throws IOException, ParseException {
    CommandLineProcessor cmdLine = new CommandLineProcessor();
    Map<String, String[]> orderMap = cmdLine.inputProcessor(args);

    OrderProcessor orderProcessor = new OrderProcessor();
    if (orderProcessor.buildAndOrder(orderMap)) {
      System.out.println("Hurray!!! LendUp has confirmed your order.");
    } else {
      System.out.println("Uff!!! Order got declined due to some technical difficulty.");
    }
  }

  public String getGreeting() {
    return "Hello world.";
  }
}
