package com.study.pattern.template.staticproxy;

public class Tea implements IBeverage {
    private boolean wantsCondiments = false;
    public void brew() {
        System.out.println("冲泡红茶包");
    }

    public void addCondiments() {
        System.out.println("添加蜂蜜");
    }

    public void setWantsCondiments(boolean wantsCondiments) {
        this.wantsCondiments = wantsCondiments;
    }

    public boolean customerWantsCondiments() {
        return wantsCondiments;
    }
}
