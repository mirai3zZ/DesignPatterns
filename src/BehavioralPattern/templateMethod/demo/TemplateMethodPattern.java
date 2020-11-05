package BehavioralPattern.templateMethod.demo;

//模板类型
public class TemplateMethodPattern {
    public static void main(String[] args)
    {
        AbstractClass tm=new ConcreteClass();
        tm.TemplateMethod();
    }
}
