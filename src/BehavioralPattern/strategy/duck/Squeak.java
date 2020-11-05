package BehavioralPattern.strategy.duck;

public class Squeak implements QuackBehavior {

  /** 吱吱叫 */
  @Override
  public void quack() {
    System.out.println("吱吱叫");
  }
}
