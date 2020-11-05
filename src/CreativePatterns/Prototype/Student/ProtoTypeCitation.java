package CreativePatterns.Prototype.Student;

/*
* 用原型模式除了可以生成相同的对象，还可以生成相似的对象
* 用原型模式生成“三好学生”奖状
* */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Citation obj1=new Citation("张三","同学：在2019学年第一学期中表现优秀，被评为三好学生。","软件学院");
        obj1.display();
        Citation obj2=(Citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}
