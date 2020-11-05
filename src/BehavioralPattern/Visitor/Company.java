package BehavioralPattern.Visitor;

//抽象访问者：公司
public interface Company {
    String create(Paper element);
    String create(Cuprum element);
}
