package com.concurrency.programming.chapter01.example03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CPUBoundExample {

    public static void main(String[] args) {

        int cpuCore = Runtime.getRuntime().availableProcessors();
        Executor executorService = Executors.newFixedThreadPool(cpuCore);

        long startTime = System.currentTimeMillis();

        List<CompletableFuture> futures = new ArrayList<>();

        for (int i = 0; i < cpuCore; i++) {
            CompletableFuture.runAsync(() -> {
                // CPU 연산이에 집중되고 오래걸리는 작업 (CPU 버스트)
                long result = 0L;
                for (int j = 0; j < Integer.MAX_VALUE; j++) {
                    result += j;
                }

                // 아주 잠깐 대기
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {

                }
            });
        }

        long endTime = System.currentTimeMillis();
    }
}
