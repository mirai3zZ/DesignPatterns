package StructuredPattern.decorator;

public class Girl extends Changer{
    public Girl(Morrigan m) {
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
        ((original) super.m).setImage("Morrigan2.jpg");
    }
}
