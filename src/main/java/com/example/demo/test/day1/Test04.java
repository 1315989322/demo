package com.example.demo.test.day1;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day1
 * @ClassName: Test04
 * @Author: wangxu
 * @Description: String StringBuffer StringBuilder
 * @Date: 2021/2/20 0020 11:48
 * @Version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        String s=new String("hello");

        StringBuffer buffer=new StringBuffer();
        buffer.append("hello").append("world");

        StringBuilder builder=new StringBuilder();
        buffer.append("hello").append("world");

        //1.String 是final修饰的类，每次都是声明不可变的的String对象
        //2.StringBuilder 和StringBuffer都是继承的abstractStringBuilder 二者都是可变的
        //但StringBuffer中的方法使用synchronized修饰的所以效率比StringBuilder低 但在多线程环境中是安全的
    }
}
