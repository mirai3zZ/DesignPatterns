package BehavioralPattern.Visitor;

//抽象元素：材料
public interface Material {
    String accept(Company visitor);
}
