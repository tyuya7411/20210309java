package com.n.examT;

public class Box1 extends Box {
    public Box1(){
        length = 5;
        width = 10;
        heigth = 10;
    }

    @Override
    public String getName(){return "Box1";}
    @Override
    public int getPrice(){return 40;}

}
