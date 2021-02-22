package com.example.demo.test.day1;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day1
 * @ClassName: Test06
 * @Author: wangxu
 * @Description: 抽象类
 * @Date: 2021/2/20 0020 14:26
 * @Version: 1.0
 */
public class Test06 {

     //1.由abstract修饰的类叫抽象类
    //2.抽象类中可以用抽象方法和非抽象方法，普通类中不可以有抽象方法
    //3.抽象类无法直接声明，需要普通类继承使用
    //4.抽象类不能用final修饰，因为final修饰的类不能被继承这和抽象类被继承才能使用相冲突


    /**
     * 抽象类和接口的区别
     */
        //1.一个是接口使用implements实现 一个是类使用extends继承，可以有构造方法 ，main方法
        //2.接口中只能是抽象方法,抽象类中可以有非抽象方法
        //3.类可以实现多个接口，但只能继承一个抽象类//单继承多实现
        //4.接口中的方法默认是用public修饰，抽象类可以随意

    abstract static class Test{
        public abstract void test();

        public static void test2(){

        }
    }

    interface TestIn{
        public static final String FL="";
        void test();
    }
}
