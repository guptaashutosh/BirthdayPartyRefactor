package scrap.heap.refactor.builders;

import scrap.heap.refactor.domain.*;

public class CakeBuilder {
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
