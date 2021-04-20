package com.n.exam1;

public abstract class Box {
    int length;
    int width;
    int heigth;

    public boolean validate (int a, int b ,int c ) { return ( a<= length && b<= width && c<=heigth );}

    public abstract int getPrice();
}
