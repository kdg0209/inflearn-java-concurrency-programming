package com.concurrency.programming.chapter02.example03;

public class TerminatedThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> System.out.println("스레드 실행중"));

        thread.start();
        thread.join();

        // TERMINATED
        System.out.println("스레드 상태: " + thread.getState().name());
    }
}
