package scrap.heap.refactor.domain;

import scrap.heap.refactor.domain.constants.Colors;
import scrap.heap.refactor.domain.constants.Material;

public class Balloon implements Orderable<Balloon> {
  private Colors balloonColor;
  private Material material;
  private Integer number;

  private Balloon() {
  }

  private Balloon(final Colors balloonColor, final Material material, final int number) {
    this.balloonColor = balloonColor;
    this.material = material;
    this.number = number;
  }

  public Colors getBalloonColor() {
    return balloonColor;
  }

  public Material getMaterial() {
    return material;
  }

  public Integer getNumber() {
    return number;
  }

  /**
   * Use for printing the order. Note : Using the String Builder, which is faster, over StringBuffer
   * but its not thread safe and we don't have requirement otherwise we will use thread-safe and
   * synchronize one which is StringBuffer
   *
   * @return String
   */
  @Override
  public String toString() {

    return new StringBuilder()
        .append("Balloons ordered; ")
        .append(balloonColor)
        .append(", ")
        .append(material.getMaterialType())
        .append(", ")
        .append(number)
        .toString();
  }

  public static class BalloonBuilder {
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
}
