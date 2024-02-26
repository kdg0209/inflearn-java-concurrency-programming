package com.concurrency.programming.chapter02.example01;

public class AnonymousThreadExample {

    public static void main(String[] args) {

        Thread threadA = new Thread(() -> System.out.println("람다로 만들어 실행시키는 스레드"));

        Thread threadB = new Thread() {
            @Override
            public void run() {
                System.out.println("익명 객체로 만들어 실행시키는 스레드");
            }
        };

        threadA.start();
        threadB.start();
    }
}
