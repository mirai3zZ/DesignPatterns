package BehavioralPattern.strategy.duck;

public class RedheadDuck extends Duck {

  /** 外观是红头 */
  @Override
  void display() {
    System.out.println("外观是红头的鸭子");
  }
}
