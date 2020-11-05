package BehavioralPattern.strategy.duck;

public class FlyNoWay implements FlyBehavior {

  /** 不会飞 */
  @Override
  public void fly() {
    System.out.println("");
  }
}
