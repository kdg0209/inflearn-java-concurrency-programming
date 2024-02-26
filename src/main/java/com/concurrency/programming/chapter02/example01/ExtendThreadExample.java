package com.concurrency.programming.chapter02.example01;

public class ExtendThreadExample {

    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();

    }
}

class MyThread extends Thread {

    public MyThread() {

    }

    public MyThread(Runnable task) {
        super(task);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 사용자 정의 스레드를 실행시킨다.");
    }
}
