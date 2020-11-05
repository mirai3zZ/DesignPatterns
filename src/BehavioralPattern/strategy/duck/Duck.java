package BehavioralPattern.strategy.duck;

public abstract class Duck {

  /** 呱呱叫行为(所有鸭子都会) */
  public void quack() {
    System.out.println("呱呱叫");
  }

  /** 游泳行为（所有鸭子都会） */
  public void swim() {
    System.out.println("游泳");
  }

  /** 每个鸭子额外观都不同 所以display是抽象方法 */
  abstract void display();
}
