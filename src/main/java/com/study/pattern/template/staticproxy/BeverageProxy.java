package com.study.pattern.template.staticproxy;

public class BeverageProxy implements IBeverage {
    private IBeverage beverage;

    public BeverageProxy(IBeverage beverage) {
        this.beverage = beverage;
    }

    public void getDrinks() {
        //1、将水煮开
        boilWater();
        //2、冲泡茶、果汁粉、咖啡
        brew();
        //3、把饮料倒进杯子
        pourInCup();
        //4、在饮料中加入适当的调料
        if(customerWantsCondiments()) {//可以实现微调
            addCondiments();
        }
    }

    private void pourInCup() {
        System.out.println("把饮料倒入杯子中");
    }

    private void boilWater() {
        System.out.println("将水煮开");
    }

    public boolean customerWantsCondiments() {
        return beverage.customerWantsCondiments();
    }

    public void brew() {
        beverage.brew();
    }

    public void addCondiments() {
        beverage.addCondiments();
    }


}
