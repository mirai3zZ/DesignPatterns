package StructuredPattern.Flyweight;

import java.awt.*;
/*
* 实现抽象享元角色，
* 具体享元角色，白子
* */
public class WhitePieces implements ChessPieces {


    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x,pt.y,30,30);

    }
}
