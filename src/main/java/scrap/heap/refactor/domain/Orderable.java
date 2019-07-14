package scrap.heap.refactor.domain;

/**
 * Interface to have 'default' place order implementation and it can also have more methods to
 * enforce concrete class to implement.
 *
 * @param <E>
 */
public interface Orderable<E> {
  /**
   * Default implementation to place an order Note : Not recommended to use reflection but for this
   * POC, we are invoking toString()otherwise it will have either implementation in concrete class
   * or in default function we implement the functionality without using the reflection
   *
   * @param <E> Generic implementation of the class type
   * @throws ReflectiveOperationException
   */
  default <E> void placeOrder() throws ReflectiveOperationException {
    String response = getClass().getDeclaredMethod("toString").invoke(this).toString();
    System.out.println(response);
  }
}
