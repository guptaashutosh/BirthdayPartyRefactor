package scrap.heap.refactor.domain;

public class Balloon implements Orderable<Balloon> {
  private Colors balloonColor;
  private Material material;
  private Integer number;

  public Balloon(final Colors balloonColor, final Material material, final int number) {
    this.balloonColor = balloonColor;
    this.material = material;
    this.number = number;
  }

  public Colors getBalloonColor() {
    return balloonColor;
  }

  public Balloon setBalloonColor(Colors balloonColor) {
    this.balloonColor = balloonColor;
    return this;
  }

  public Material getMaterial() {
    return material;
  }

  public Balloon setMaterial(Material material) {
    this.material = material;
    return this;
  }

  public Integer getNumber() {
    return number;
  }

  public Balloon setNumber(Integer number) {
    this.number = number;
    return this;
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
}
