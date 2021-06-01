package com.n.exam1;

import com.n.examT.Box1;
import com.n.examT.Box2;
import com.n.examT.Box3;
import com.n.examT.Box4;
import com.n.examT.Box5;
import com.n.examT.Box6;

import java.util.Scanner;

public class Boxtester {
    public static void main(String[] args) {
        com.n.examT.Box1 box1 = new Box1();
        com.n.examT.Box2 box2 = new Box2();
        com.n.examT.Box3 box3 = new Box3();
        com.n.examT.Box4 box4 = new Box4();
        com.n.examT.Box5 box5 = new Box5();
        com.n.examT.Box6 box6 = new Box6();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s length");
        int length =Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s width");
        int width =Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s heigth");
        int heigth =Integer.parseInt(scanner.next());

        System.out.println("Langth : " + length + ",Width : " + width +",Heigth : " + heigth);
        if (box1.vaildate(length,width,heigth)){
            System.out.println("一號便利箱 ," + box1.getPrice() + "元");
        }
        if (box2.vaildate(length,width,heigth)){
            System.out.println("二號便利箱 ," + box2.getPrice() + "元");
        }
        if (box3.vaildate(length,width,heigth)){
            System.out.println("三號便利箱 ," + box3.getPrice() + "元");
        }
        if (box4.vaildate(length,width,heigth)){
            System.out.println("四號便利箱 ," + box4.getPrice() + "元");
        }
        if (box5.vaildate(length,width,heigth)){
            System.out.println("五號便利箱 ," + box5.getPrice() + "元");
        }
        if (box6.vaildate(length,width,heigth)){
            System.out.println("六號便利箱 ," + box6.getPrice() + "元");
        }

    }
}
