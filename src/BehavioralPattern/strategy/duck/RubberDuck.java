package BehavioralPattern.strategy.duck;

public class RubberDuck extends Duck {

  /** 不会飞 什么都不做 */
  @Override
  public void display() {
    System.out.println("");
  }

  /** 吱吱叫(不会 呱呱叫) */
  @Override
  public void quack() {
    System.out.println("吱吱叫");
  }
}
