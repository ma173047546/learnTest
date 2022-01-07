package com.demo.jdk8.stream.dao;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);

}
