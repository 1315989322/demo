package com.example.demo.test.day2;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day2
 * @ClassName: Test02
 * @Author: wangxu
 * @Description: 线程的状态
 * @Date: 2021/2/22 0022 11:20
 * @Version: 1.0
 */
public class Test02 {


    public static void main(String[] args) throws InterruptedException {
        Thread t =new Thread();
        Thread.State state = t.getState();
        System.out.println(state);
        t.start();
        Thread.State state1 = t.getState();
        System.out.println(state1);

        t.wait();
        t.getState();

        /**
         * 线程的状态
         * @see Thread.State
         */


    }

}
