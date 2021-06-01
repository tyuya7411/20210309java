package com.n.examT;

public abstract class Box {
    int length;
    int width;
    int heigth;

    public boolean vaildate (int a, int b ,int c ) { return ( a<= length && b<= width && c<=heigth );}
    public abstract String getName();

    public abstract int getPrice();
}
