package scrap.heap.refactor.builders;

import scrap.heap.refactor.domain.Balloon;
import scrap.heap.refactor.domain.Colors;
import scrap.heap.refactor.domain.Material;

/** Class to build balloon */
public class BalloonBuilder {
  private Colors balloonColor;
  private Material material;
  private int number;

  public BalloonBuilder setBalloonColor(Colors balloonColor) {
    this.balloonColor = balloonColor;
    return this;
  }

  public BalloonBuilder setMaterial(Material material) {
    this.material = material;
    return this;
  }

  public BalloonBuilder setNumber(int number) {
    this.number = number;
    return this;
  }

  public Balloon createBalloon() {
    return new Balloon(balloonColor, material, number);
  }
}
