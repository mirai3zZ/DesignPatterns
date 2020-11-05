package BehavioralPattern.strategy.duck;

public interface QuackBehavior {

  /** 呱呱叫行为（每一个新的叫行为都必须实现quack方法） */
  void quack();
}
