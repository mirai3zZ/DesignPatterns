package StructuredPattern.decorator;

//具体装饰角色：女妖
public class Succubus extends Changer{
    public Succubus(Morrigan m) {
        super(m);
    }
    @Override
    public void display()
    {
        setChanger();
        super.display();
    }
    public void setChanger()
    {
        ((original) super.m).setImage("Morrigan1.jpg");
    }
}
