package com.example.demo.test.day1;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day1
 * @ClassName: Test01
 * @Author: wangxu
 * @Description: == 和equals
 * @Date: 2021/2/20 0020 9:27
 * @Version: 1.0
 */
public class Test01 {

    /**
     *  ==比较基本数据类型比较的是值
     *  ==比较引用数据类型比较的是对象的引用
     */

    /**
     * equals本质上是==，默认情况下是引用的比较，一些类重写了equals 使其变成值的比较 如 String Integer等
     */

    /**
     * 两个对象的hashcode相同，equals不一定为true
     * @param args
     */

    public static void main(String[] args) {
        String s1="hello";
        String s2="hello"; //s1,s2指向同一个常量池中的引用
        String s3=new String ("hello"); //新开辟了一块内存
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true


        Cat cat1=new Cat("red");
        Cat cat2=new Cat("red");
        System.out.println(cat1==cat2);//false
        System.out.println(cat1.equals(cat2));//false

        //
        String ss1=new String ("hello");
        String ss2=new String ("hello");
        System.out.println(ss1==ss2);//false  ==比较的是对象的引用
        System.out.println(ss1.equals(ss2));//true   重写了equals方法 所以是true


        String str1="通话";
        String str2="重地";
        System.out.println(String.format("str1: %d | str2: %d", str1.hashCode(),str2.hashCode())); // 1179395
        System.out.println(str1.equals(str2)); //false
    }


static class Cat{
        private String color;

    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String color) {
        this.color = color;
    }
}

}
