package com.study.pattern.template.methodextends;

/**
 * 通过继承实现模板模式
 */
public abstract class BeverageTemplate {
    public void prepareRecipe(){
        //1、将水煮开
        this.boilWater();
        //2、冲泡茶、果汁粉、咖啡
        this.brew();
        //3、把饮料倒进杯子
        this.pourInCup();
        //4、在饮料中加入适当的调料
        if(customerWantsCondiments()) {//可以实现微调
            this.addCondiments();
        }
    }

    protected boolean customerWantsCondiments(){
        return false;
    }

    protected abstract void addCondiments();

    final void pourInCup() {
        System.out.println("把饮料倒入杯子中");
    }

    protected abstract void brew();

    final void boilWater() {
        System.out.println("将水煮开");
    }
}
