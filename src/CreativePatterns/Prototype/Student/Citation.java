package CreativePatterns.Prototype.Student;
/*
* 奖状类
* 原型设计模式
* */
public class Citation implements Cloneable{
    private String name;
    private String info;
    private String college;
    Citation(String name,String info,String college){
        this.name=name;
        this.info=info;
        this.college=college;
        System.out.println("奖状创建成功！");
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return(this.name);
    }
    void display()
    {
        System.out.println(name+info+college);
    }
    public Object clone()throws CloneNotSupportedException{
        System.out.println("奖状copy成功");
        return super.clone();
    }
}
