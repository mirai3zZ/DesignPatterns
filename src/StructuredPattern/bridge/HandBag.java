package StructuredPattern.bridge;

//扩展抽象化角色：挎包
class HandBag extends Bag
{
    @Override
    public String getName()
    {
        return color.getColor()+"HandBag";
    }
}
