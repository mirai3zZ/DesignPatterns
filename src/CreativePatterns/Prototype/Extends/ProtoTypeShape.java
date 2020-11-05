package CreativePatterns.Prototype.Extends;

/*
* 原型模式可扩展为带原型管理器的原型模式，
* 它在原型模式的基础上增加了一个原型管理器 PrototypeManager 类。
* 该类用 HashMap 保存多个复制的原型，
* Client 类可以通过管理器的 get(String id) 方法从中获取复制的原型。
* */
public class ProtoTypeShape {
    public static void main(String[] args)
    {
        ProtoTypeManager pm=new ProtoTypeManager();
        Shape obj1=(Circle)pm.getShape("Circle");
        obj1.countArea();
        Shape obj2=(Shape)pm.getShape("Square");
        obj2.countArea();
    }
}
