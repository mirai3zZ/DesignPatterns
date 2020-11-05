package BehavioralPattern.strategy.duck;

public class MallardDuck extends Duck {

  /** 头是绿色的 */
  @Override
  void display() {
    System.out.println("外观是绿头的鸭子");
  }
}
