package BehavioralPattern.templateMethod.hook;

public class HookTemplateMethod {
    public static void main(String[] args)
    {
        HookAbstractClass tm=new HookConcreteClass();
        tm.TemplateMethod();
    }
}
