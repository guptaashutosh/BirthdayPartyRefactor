package scrap.heap.refactor.builders;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import scrap.heap.refactor.domain.Cake;
import scrap.heap.refactor.domain.constants.Colors;
import scrap.heap.refactor.domain.constants.Flavors;
import scrap.heap.refactor.domain.constants.Shapes;
import scrap.heap.refactor.domain.constants.Sizes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class CakeBuilderTest {

  private Cake.CakeBuilder cakeBuilder;

  @Before
  public void setUp() throws Exception {
    cakeBuilder = new Cake.CakeBuilder();
  }

  @Test
  public void testFlavor() {
    cakeBuilder.setFlavor(Flavors.CHOCOLATE).createCake();
    assertNotNull(cakeBuilder);
  }

  @Test
  public void testFrostingFlavor() {
    cakeBuilder.setFrostingFlavor(Flavors.CHOCOLATE).createCake();
    assertNotNull(cakeBuilder);
  }

  @Test
  public void testShape() {
    cakeBuilder.setShape(Shapes.CIRCLE).createCake();
    assertNotNull(cakeBuilder);
  }

  @Test
  public void testSize() {
    cakeBuilder.setSize(Sizes.LARGE).createCake();
    assertNotNull(cakeBuilder);
  }

  @Test
  public void testCakeColor() {
    cakeBuilder.setCakeColor(Colors.BROWN).createCake();
    assertNotNull(cakeBuilder);
  }

  @Test
  public void testCreateCake() {
    this.cakeBuilder
            .setCakeColor(Colors.BROWN)
            .setFlavor(Flavors.CHOCOLATE)
            .setFrostingFlavor(Flavors.VANILLA)
            .setShape(Shapes.CIRCLE)
            .setSize(Sizes.SMALL);
    Cake cake = cakeBuilder.createCake();
    assertNotNull("Cake component missing color.", cake.getCakeColor());
    assertNotNull("Cake component missing flavor.", cake.getFlavor());
    assertNotNull("Cake component missing shape.", cake.getShape());
    assertNotNull("Cake component missing size.", cake.getSize());
    assertNotNull("Cake component missing frosting flavor.", cake.getFrostingFlavor());
  }

  @Test
  public void test_can_create_empty_cake() {
    Cake cake = cakeBuilder.createCake();
    assertNull("Empty cake without color .", cake.getCakeColor());
    assertNull("Empty cake without flavor.", cake.getFlavor());
    assertNull("Empty cake without shape", cake.getShape());
    assertNull("Empty cake without size", cake.getSize());
    assertNull("Empty cake without frosting color", cake.getFrostingFlavor());
  }

  @Test
  public void testPlaceOrder() {
    this.cakeBuilder
            .setCakeColor(Colors.BROWN)
            .setFlavor(Flavors.CHOCOLATE)
            .setFrostingFlavor(Flavors.VANILLA)
            .setShape(Shapes.CIRCLE)
            .setSize(Sizes.SMALL);
    try {
      cakeBuilder.createCake().placeOrder();
    } catch (ReflectiveOperationException e) {
      Assert.fail("Failed the cake creation");
    }
  }
}
