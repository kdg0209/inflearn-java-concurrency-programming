package com.concurrency.programming.chapter02.example01;

public class ImplementRunnableExample {

    public static void main(String[] args) {

        Runnable runnable = new MyRunnable();
        Thread threadA = new Thread(runnable);
        Thread threadB = new MyThread(runnable);
        threadA.start();
        threadB.start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 사용자 정의 스레드를 실행시킨다.");
    }
}
