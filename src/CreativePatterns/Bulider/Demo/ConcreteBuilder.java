package CreativePatterns.Bulider.Demo;

public class ConcreteBuilder extends Builder {
  @Override
  public void buildPartA() {
    product.setPartA("建造 wall");
  }

  @Override
  public void buildPartB() {
    product.setPartB("建造 sofa");
  }

  @Override
  public void buildPartC() {
    product.setPartC("建造 windows");
  }
}
