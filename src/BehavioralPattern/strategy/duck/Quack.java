package BehavioralPattern.strategy.duck;

public class Quack implements QuackBehavior {

  /** 呱呱叫 */
  @Override
  public void quack() {
    System.out.println("呱呱叫");
  }
}
