package com.demo.jdk8;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {
    public static class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                System.out.println("i - >"+ 0);
            }
        }
    }
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("x - >"+i);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.setDaemon(false);
        System.out.println("线程开始 ----->");
        myThread.join();

        myThread.start();

        System.out.println("线程结束 ----->");
        for (int i = 0; i < 5; i++) {
            System.out.println("kkk"+i);
        }

//        MyRunnable myRunnable = new MyRunnable();
//        System.out.println("线程开始 ----->");
//        myRunnable.run();
//        System.out.println("线程结束 ----->");

//        System.out.println("线程开始 ----->");
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("x - >"+i);
//                }
//            }
//        });
//        thread.start();
//        System.out.println("线程结束 ----->");
    }
}
