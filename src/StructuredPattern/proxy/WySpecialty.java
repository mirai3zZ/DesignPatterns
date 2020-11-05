package StructuredPattern.proxy;

import javax.swing.*;
import java.awt.*;

/*
* 真实主题：EVA图片
* */
public class WySpecialty extends JFrame implements Specialty{
    private static final long serialVersionUID=1L;
    public WySpecialty()
    {
        super("代理测试");
        this.setLayout(new GridLayout(1,1));
        JLabel l1=new JLabel(new ImageIcon("src/common/EVA.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void display()
    {
        this.setVisible(true);
    }

}
