package com.concurrency.programming.chapter02.example03;

public class BlockedThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                while (true) {

                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Lock을 획득하기 위해 노력 중");
            }
        });

        threadA.start();
        threadB.start();

        System.out.println("threadA 상태: " + threadA.getState().name()); // RUNNABLE
        System.out.println("threadB 상태: " + threadB.getState().name()); // BLOCKED
    }
}
