package com.study.pattern.template.methodextends;

public class Tea extends BeverageTemplate {
    protected void addCondiments() {
        System.out.println("添加蜂蜜");
    }

    protected void brew() {
        System.out.println("冲泡红茶包");
    }
}
