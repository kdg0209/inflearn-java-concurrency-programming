package com.concurrency.programming.chapter02.example03;

public class NewStateThreadExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("스레드 실행중"));

        // NEW
        System.out.println("스레드 상태: " + thread.getState().name());
    }
}
