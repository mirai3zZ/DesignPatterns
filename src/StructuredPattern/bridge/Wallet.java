package StructuredPattern.bridge;

//扩展抽象化角色：钱包
class Wallet extends Bag
{
    @Override
    public String getName()
    {
        return color.getColor()+"Wallet";
    }
}
