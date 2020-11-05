package BehavioralPattern.strategy.duck;

public class MuteQuack implements QuackBehavior {

  /** 不会叫 */
  @Override
  public void quack() {
    System.out.println("");
  }
}
