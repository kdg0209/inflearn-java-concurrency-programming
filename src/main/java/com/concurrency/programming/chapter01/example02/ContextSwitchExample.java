package com.concurrency.programming.chapter01.example02;

public class ContextSwitchExample {

    public static void main(String[] args) {

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("threadA: " + i);
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {}
            }
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("threadB: " + i);
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {}
            }
        });

        Thread threadC = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("threadC: " + i);
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {}
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
