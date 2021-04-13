package com.n.racing;

public class HorseRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("RR " + i);
        }
    }
}
