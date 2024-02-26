package com.concurrency.programming.chapter02.example03;

public class RunnableThreadExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("스레드 실행중"));
        thread.start();

        // RUNNABLE
        System.out.println("스레드 상태: " + thread.getState().name());
    }
}
