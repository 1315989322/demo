package com.example.demo.test.day1;

import java.io.*;
import java.util.Collection;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test.day1
 * @ClassName: Test07
 * @Author: wangxu
 * @Description: IO流
 * @Date: 2021/2/20 0020 14:39
 * @Version: 1.0
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        //输入流 输出流
        //字节流 字符流
        //字节流和字符流的区别是  字节流是按8为传输以字节为
        // 单位输入输出数据，字符流是按16位传输以字符为单位输入输出数据

        InputStream is =new ObjectInputStream(new FileInputStream(new File("D:\\test.txt")));
        byte [] buffer=new byte[1024*8];
        int read = is.read(buffer);

        OutputStream os =new FileOutputStream("D:\\test2.txt");
        os.write(buffer);




    }
}
