package com.example.demo.test.day2;

import jdk.nashorn.internal.codegen.CompilerConstants;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day2
 * @ClassName: Test01
 * @Author: wangxu
 * @Description:
 * @Date: 2021/2/22 0022 9:07
 * @Version: 1.0
 */
public class Test01 {


    static class MyThread1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread1:"+i);
            }
        }
    }

    static class MyThread2 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread2:"+i);
            }
        }
    }

    static class  MyThread3 implements Callable{

        @Override
        public Object call() throws Exception {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread3:"+i);
            }
            return null;
        }
    }


    public static void main(String[] args) {
        Thread t1=new MyThread1();
        t1.start();
        Thread t2=new Thread(new MyThread2());
        t2.start();

        MyThread3 myThread3=new MyThread3();
        FutureTask futureTask=new FutureTask(myThread3);
        futureTask.run();

        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(20);
        executor.setKeepAliveSeconds(100);
        executor.setMaxPoolSize(100);
        executor.initialize();
        executor.execute(futureTask);



        //4种方式开启线程
        //1.继承Thread类
        //2.实现Runnable接口
        //3.实现Callable接口后使用FutureTask  ft.run();
        //4.使用线程池ThreadPoolTaskExecutor


        /**
         * 并行和并发的区别
         * 1.并行指2个或多个事件在同一时刻发生，并发指两个或多个事件在同一时间间隔发送
         * 2.并行是在不同实体上的多个事件，并发是在同一实体上的多个事件。
         * 3.在一台处理器上“同时”处理多个任务，在多台机器上同时处理多个任务。如hadoop的分布式集群
         */

        /**
         * 线程和进程的区别:
         * 1.进程是程序运行的和资源分配的基本单位，一个程序至少有一个进程，一个进程至少有一个线程
         * 2.进程在执行过程中拥有独立的内存单元，而多个线程共享内存资源，减少切换次数，从而效率更高
         * 3.线程是进程的一个实体，是cpu调度和分派的基本单位，是比程序更小的能独立运行的基本单位。
         * 4.同一个进程中的多个线程可以并发执行
         */

        /**
         * 什么是守护线程 daemon线程
         *
         * 用来服务与用户线程的线程，不需要上层逻辑介入。
         * 当线程只剩下守护线程时JVM就会退出，如果还有其他任意一个用户线程存在JVM就不会退出
         * */
        /**
         * 注意:
         * 1.t.setDaemon(true);必须在t.start();之前，因为我们不能将一个正在运行的线程设置为守护线程，否则会抛出IllegalThreadStateException异常
         * 2.在守护线程中产生的新线程也是守护线程
         * 3.守护线程不能用于去访问固有资源，比如读写操作或者计算逻辑，因为他会在任意时候发生中断
         * 4.Java自带的线程框架ExecutorService 会将守护线程转变为用户线程，因此要使用后台线程就不能使用线程池
         */
        /**
         * 意义和场景
         * 当主线程结束时，结束其余的子线程（守护线程）自动关闭，就免去了还要继续关闭子线程的麻烦。
         * 如：Java垃圾回收线程就是一个典型的守护线程；内存资源或者线程的管理，但是非守护线程也可以。
         */
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread daemon:" + i);
            }
        });
        t.setDaemon(true);
        t.start();

    }

}
