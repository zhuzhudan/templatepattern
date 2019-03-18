package com.study.pattern.template.staticproxy;

/**
 * 通过静态代理，接口，实现模板模式
 */
public interface IBeverage {
    void brew();
    void addCondiments();
    boolean customerWantsCondiments();
}
