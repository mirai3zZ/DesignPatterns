package StructuredPattern.Flyweight;

import java.util.ArrayList;

/*
* 享元工厂角色
* */
public class WeiqiFactory {
    private ArrayList<ChessPieces> qz;

    public WeiqiFactory(){
        qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhitePieces();
        ChessPieces b = new BlackPieces();

        qz.add(w);
        qz.add(b);
    }

    public ChessPieces getChessPieces(String type){
        if (type.equalsIgnoreCase("w")){
            return qz.get(0);
        }
        else if (type.equalsIgnoreCase("b")){
            return qz.get(1);
        }else {
            return null;
        }
    }
}
