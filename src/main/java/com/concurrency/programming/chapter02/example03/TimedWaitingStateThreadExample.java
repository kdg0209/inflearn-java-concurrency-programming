package com.concurrency.programming.chapter02.example03;

public class TimedWaitingStateThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        });

        thread.start();
        Thread.sleep(100);

        // TIMED_WAITING
        System.out.println("스레드 상태: " + thread.getState().name());
    }
}
