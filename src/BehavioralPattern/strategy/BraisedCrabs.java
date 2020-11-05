package BehavioralPattern.strategy;

import javax.swing.*;

//具体策略类：红烧大闸蟹
class BraisedCrabs extends JLabel implements CrabCooking
{
    private static final long serialVersionUID=1L;
    public void CookingMethod()
    {
        this.setIcon(new ImageIcon("src/common/BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
