package scrap.heap.refactor.domain;

import scrap.heap.refactor.domain.constants.Colors;
import scrap.heap.refactor.domain.constants.Flavors;
import scrap.heap.refactor.domain.constants.Shapes;
import scrap.heap.refactor.domain.constants.Sizes;

/** Care Object and its Orderable entity, which means you can place order using this entity */
public class Cake implements Orderable<Cake> {
  private Flavors flavor;
  private Flavors frostingFlavor;
  private Shapes shape;
  private Sizes size;
  private Colors cakeColor;

    /**
     * Private Constructor Making it private so that it can't be instantiated from anywhere else
     */
    private Cake() {
    }

  private Cake(Flavors flavor, Flavors frostingFlavor, Shapes shape, Sizes size, Colors cakeColor) {
    this.flavor = flavor;
    this.frostingFlavor = frostingFlavor;
    this.shape = shape;
    this.size = size;
    this.cakeColor = cakeColor;
  }

  public Flavors getFlavor() {
    return flavor;
  }

  public Flavors getFrostingFlavor() {
    return frostingFlavor;
  }

  public Shapes getShape() {
    return shape;
  }

  public Sizes getSize() {
    return size;
  }

  public Colors getCakeColor() {
    return cakeColor;
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

  public static class CakeBuilder {
    private Flavors flavor;
    private Flavors frostingFlavor;
    private Shapes shape;
    private Sizes size;
    private Colors cakeColor;

    public CakeBuilder setFlavor(Flavors flavor) {
      this.flavor = flavor;
      return this;
    }

    public CakeBuilder setFrostingFlavor(Flavors frostingFlavor) {
      this.frostingFlavor = frostingFlavor;
      return this;
    }

    public CakeBuilder setShape(Shapes shape) {
      this.shape = shape;
      return this;
    }

    public CakeBuilder setSize(Sizes size) {
      this.size = size;
      return this;
    }

    public CakeBuilder setCakeColor(Colors cakeColor) {
      this.cakeColor = cakeColor;
      return this;
    }

    public Cake createCake() {
      return new Cake(flavor, frostingFlavor, shape, size, cakeColor);
    }
  }
}
