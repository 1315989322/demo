package com.example.demo.test.day1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day1
 * @ClassName: Test08
 * @Author: wangxu
 * @Description: Java 容器
 * @Date: 2021/2/20 0020 15:25
 * @Version: 1.0
 */
public class Test08 {


    public static void main(String[] args) {
        //Collection 和Collections的区别：
        //Collection是接口 Collections是java容器的操作工具类
        //获取线程安全的map
        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());
        // Collection 下 有   List  Set  Queue

        //HashMap和HashTable的区别
        //HashMap是线程不安全的异步的 效率比HashTable高
        //HashMap是线程安全的同步的
        //HashMap允许空key空value 而HashTable不允许
        //HashMap去掉了HashTable中的contains方法
        HashMap hashMap=new HashMap();
        hashMap.containsKey("");
        hashMap.containsValue("");
        hashMap.put("","");
        hashMap.put("","");
        Hashtable hashtable=new Hashtable();
        hashtable.contains("");
        hashtable.containsKey("");
        hashtable.containsValue("");

        //HashMap的原理
        //默认容量16   static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
        //扩容 0.75f  static final float DEFAULT_LOAD_FACTOR = 0.75f;
        //最大容量 1 << 30 1,073,741,824 static final int MAXIMUM_CAPACITY = 1 << 30;
        //linked 节点到8时转变为树
        //树节点缩减至6时变为linked
        //树最小容量为 64  static final int MIN_TREEIFY_CAPACITY = 64;


        //先通过 map的key 通过hash算法算出一个位置，然后判断改位置上是否有元素，没有的话将value放在改位置
        //若已有元素  1.8 选判断是红黑树还是链表  然后 则判断改位置元素的key的hashcode是否一致，若一致则替换value
        //若不一致则在改位置的链表移动一个位置 当链表长度到达8时将转变为红黑树
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        concurrentHashMap.put("", "");
    }

}
