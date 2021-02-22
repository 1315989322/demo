package com.example.demo.test.day1;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day1
 * @ClassName: Test05
 * @Author: wangxu
 * @Description:
 * @Date: 2021/2/20 0020 14:12
 * @Version: 1.0
 */
public class Test05 {

    public static void main(String[] args) {
        String str1="12";
        String str2=new String("12");
        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true

        //二者并不一样，内存分配不一样，一个是直接指向常量池中的12 ，另一个是在堆空间中重新分配一块内存新建一个对象并指向str2.


        //如何将字符串反转
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(str1);
        stringBuffer.reverse();

        //String的常用方法

        str1.contains("1");//判断是否包含
        str1.length();//长度
        str1.matches("");//正则匹配
        str1.charAt(0);//取某一位的字符
        str1.concat("3");//连接
        str1.substring(1);//从某位开始截取
        str1.substring(1,2);//截取
        str1.toLowerCase();//小写
        str1.toUpperCase();//大写
        str1.endsWith(".");//判断是以什么结尾
        str1.indexOf("1");//取某个字符的位置
        str1.split(",");//分割
        str1.trim();//去空格
        System.out.println(str1.compareTo(str2));//
    }
}
