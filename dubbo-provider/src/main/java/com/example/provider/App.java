package com.example.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {
    /**
     * 通过main将接口发布出去
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //加载xml配置文件启动
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF.spring/provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
