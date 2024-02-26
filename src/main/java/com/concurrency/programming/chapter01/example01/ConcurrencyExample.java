package com.concurrency.programming.chapter01.example01;

import java.util.ArrayList;
import java.util.List;

public class ConcurrencyExample {

    public static void main(String[] args) {

        // cpu core 개수: 8 * 2
        int cpuCore = Runtime.getRuntime().availableProcessors() * 2;
//        int cpuCore = Runtime.getRuntime().availableProcessors() + 1;

        // CPU 개수만큼 데이터 생성
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < cpuCore; i++) {
            data.add(i);
        }

        // CPU 개수만큼 병렬성과 동시성을 이용하여 처리
        long startTime = System.currentTimeMillis();

        int result = data.parallelStream()
                .mapToInt(i -> {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {

                    }
                    return i * i;
                })
                .sum();

        long endTime = System.currentTimeMillis();

        System.out.println("result : " + result);
        System.out.println("소요시간: " + (endTime - startTime) + "ms"); // 2초 정도 걸림
    }
}
