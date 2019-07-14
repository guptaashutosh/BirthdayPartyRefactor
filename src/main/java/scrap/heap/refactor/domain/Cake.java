package scrap.heap.refactor.domain;

/** Care Object and its Orderable entity, which means you can place order using this entity */
public class Cake implements Orderable<Cake> {
  private Flavors flavor;
  private Flavors frostingFlavor;
  private Shapes shape;
  private Sizes size;
  private Colors cakeColor;

  public Cake(Flavors flavor, Flavors frostingFlavor, Shapes shape, Sizes size, Colors cakeColor) {
    this.flavor = flavor;
    this.frostingFlavor = frostingFlavor;
    this.shape = shape;
    this.size = size;
    this.cakeColor = cakeColor;
  }

  public Flavors getFlavor() {
    return flavor;
  }

  public Cake setFlavor(Flavors flavor) {
    this.flavor = flavor;
    return this;
  }

  public Flavors getFrostingFlavor() {
    return frostingFlavor;
  }

  public Cake setFrostingFlavor(Flavors frostingFlavor) {
    this.frostingFlavor = frostingFlavor;
    return this;
  }

  public Shapes getShape() {
    return shape;
  }

  public Cake setShape(Shapes shape) {
    this.shape = shape;
    return this;
  }

  public Sizes getSize() {
    return size;
  }

  public Cake setSize(Sizes size) {
    this.size = size;
    return this;
  }

  public Colors getCakeColor() {
    return cakeColor;
  }

  public Cake setCakeColor(Colors cakeColor) {
    this.cakeColor = cakeColor;
    return this;
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append("cake ordered;; ")
        .append(flavor)
        .append(", ")
        .append(frostingFlavor)
        .append(", ")
        .append(shape)
        .append(", ")
        .append(size)
        .append(", ")
        .append(cakeColor)
        .toString();
  }
}
