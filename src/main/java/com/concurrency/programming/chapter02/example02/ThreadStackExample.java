package com.concurrency.programming.chapter02.example02;

public class ThreadStackExample {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Runnable runnable = new ExecutorRunnable(i);
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}

class ExecutorRunnable implements Runnable {

    private final int threadId;

    public ExecutorRunnable(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 현재 실행중인 스레드");
        firstMethod(threadId);
    }

    private void firstMethod(int threadId) {

        int localValue = threadId + 100;
        secondMethod(localValue);
    }

    private void secondMethod(int localValue) {
        System.out.println(Thread.currentThread().getName() + " : 스레드 ID: " + threadId + ", value: " + localValue);
    }
}