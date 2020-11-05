package BehavioralPattern.strategy.duck;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("用翅膀来飞行");
  }
}
