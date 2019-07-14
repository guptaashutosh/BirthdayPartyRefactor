package scrap.heap.refactor.domain;

public enum Material {
  MYLAR("mylar"),
  LATEX("latex");

  private String getMaterialType;

  Material(String materialType) {
    this.getMaterialType = materialType;
  }

  public String getMaterialType() {
    return getMaterialType;
  }
}
