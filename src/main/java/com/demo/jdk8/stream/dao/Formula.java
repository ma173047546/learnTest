package com.demo.jdk8.stream.dao;

public interface Formula {
    double add(int a);

    // 求平方根
    default double sqrot(int a){
        return Math.sqrt(a);
    }
}
