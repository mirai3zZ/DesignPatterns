package BehavioralPattern.strategy.duck;

public class MallardDuck2 extends Duck2 {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
  public MallardDuck2() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  /** 头是绿色的 */
  @Override
  public void display() {
    System.out.println("外观是绿头的鸭子");
  }

  public static void main(String[] args) {
      Duck2 mallardDuck2 = new MallardDuck2();
      mallardDuck2.performFly();
      mallardDuck2.setFlyBehavior(new FlyNoWay());
      mallardDuck2.performFly();
  }
}
