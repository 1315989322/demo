package com.example.demo.test.day1;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day1
 * @ClassName: Test02
 * @Author: wangxu
 * @Description: final的作用
 * @Date: 2021/2/20 0020 11:35
 * @Version: 1.0
 */
public class Test02 {
    public static final String FLAG="TRUE";

    final class ClazzPs{

    }

    class ClassPz{

        public void test02(){

        }
        final public void test(){

        }
    }

    class ClassPc extends ClassPz{
        @Override
        public void test02() {
            super.test02();
        }
    }

    public static void main(String[] args) {
        //总结
        //1.final修饰类，类不可被继承
        //2.final修饰方法，方法不可以被重写
        //3.final修饰的变量叫常量，需要在声明时初始化值且不可以更改
    }
}
