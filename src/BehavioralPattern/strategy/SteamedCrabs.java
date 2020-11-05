package BehavioralPattern.strategy;

import javax.swing.*;

//具体策略类：清蒸大闸蟹
class SteamedCrabs extends JLabel implements CrabCooking
{
    private static final long serialVersionUID=1L;
    public void CookingMethod()
    {
        this.setIcon(new ImageIcon("src/common/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}