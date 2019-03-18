package com.study.pattern.template.staticproxy;

public class Coffee implements IBeverage {
    private boolean wantsCondiments = false;
    public void brew() {
        System.out.println("冲泡咖啡粉");
    }

    public void addCondiments() {
        System.out.println("添加糖和奶");
    }

    public void setWantsCondiments(boolean wantsCondiments) {
        this.wantsCondiments = wantsCondiments;
    }

    public boolean customerWantsCondiments() {
        return wantsCondiments;
    }
}
