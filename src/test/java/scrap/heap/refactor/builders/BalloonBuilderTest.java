package scrap.heap.refactor.builders;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import scrap.heap.refactor.domain.Balloon;
import scrap.heap.refactor.domain.constants.Colors;
import scrap.heap.refactor.domain.constants.Material;

import static org.junit.Assert.*;

public class BalloonBuilderTest {

  private Balloon.BalloonBuilder balloonBuilder;

  @Before
  public void setUp() throws Exception {
    balloonBuilder = new Balloon.BalloonBuilder();
  }

  @Test
  public void testBalloonColor() {
    Balloon balloon = balloonBuilder.setBalloonColor(Colors.YELLOW).createBalloon();
    assertNotNull("Created the balloon", balloon);
    assertNotNull("Created the balloon with color", balloon.getBalloonColor());
  }

  @Test
  public void testMaterial() {
    Balloon balloon = balloonBuilder.setMaterial(Material.MYLAR).createBalloon();
    assertNotNull("Created the balloon", balloon);
    assertNotNull("Created the balloon with material", balloon.getMaterial());
  }

  @Test
  public void testNumber() {
    Balloon balloon = balloonBuilder.setNumber(4).createBalloon();
    assertNotNull("Created the balloon", balloon);
    assertNotNull("Created the balloon with number", balloon.getNumber());
  }

  @Test
  public void createBalloon() {
    Balloon balloon =
        balloonBuilder
            .setBalloonColor(Colors.YELLOW)
            .setMaterial(Material.MYLAR)
            .setNumber(4)
            .createBalloon();
    assertNotNull("Created the balloon", balloon);
    assertNotNull("Created the balloon with color", balloon.getBalloonColor());
    assertNotNull("Created the balloon with number", balloon.getNumber());
    assertNotNull("Created the balloon with material", balloon.getMaterial());
  }

  @Test
  public void emptyCreateBalloon() {
    Balloon balloon = balloonBuilder.createBalloon();
    assertNotNull("Created the balloon", balloon);
    assertNull("Created the balloon with color", balloon.getBalloonColor());
    assertThat(balloon.getNumber(), org.hamcrest.CoreMatchers.is(0));
    assertNull("Created the balloon with material", balloon.getMaterial());
  }

  @Test
  public void testPlaceOrder() {
    balloonBuilder =
        balloonBuilder.setBalloonColor(Colors.BROWN).setMaterial(Material.MYLAR).setNumber(5);
    try {
      balloonBuilder.createBalloon().placeOrder();
    } catch (ReflectiveOperationException e) {
      Assert.fail("Failed the balloon creation");
    }
  }
}
