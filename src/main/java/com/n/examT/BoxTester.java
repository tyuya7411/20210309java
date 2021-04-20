package com.n.examT;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        Box3 box3 = new Box3();
        Box4 box4 = new Box4();
        Box5 box5 = new Box5();
        Box6 box6 = new Box6();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s length");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s width");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s height");
        int height = Integer.parseInt(scanner.next());

        System.out.println("Length : " + length + "Width : " + width + "Height : " + height);
        if (box1.vaildate(length,width,height)){
            System.out.println("一號便利箱, "+ box1.getPrice()+ "元");
        }

        if (box2.vaildate(length,width,height)){
            System.out.println(box2.getName() + " "+ box2.getPrice());
        }

        if (box3.vaildate(length,width,height)){
            System.out.println(box3.getName() + " "+ box3.getPrice());
        }

        if (box4.vaildate(length,width,height)){
            System.out.println(box4.getName() + " "+ box4.getPrice());
        }

        if (box5.vaildate(length,width,height)){
            System.out.println(box5.getName() + " "+ box5.getPrice());
        }

        if (box6.vaildate(length,width,height)){
            System.out.println(box6.getName() + " "+ box6.getPrice());
        }

    }



}
