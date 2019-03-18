package com.study.pattern.template.methodextends;

public class Coffee extends BeverageTemplate {

    @Override
    protected boolean customerWantsCondiments() {
        return true;
    }

    protected void addCondiments() {
        System.out.println("添加糖和奶");
    }

    protected void brew() {
        System.out.println("冲泡咖啡粉");
    }
}
