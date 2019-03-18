package com.study.pattern.template.staticproxy;

public class Test {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.setWantsCondiments(false);
        BeverageProxy beverage = new BeverageProxy(tea);
        beverage.getDrinks();

        System.out.println("------------------------");

        Coffee coffee = new Coffee();
        coffee.setWantsCondiments(true);
        beverage = new BeverageProxy(coffee);
        beverage.getDrinks();
    }
}
