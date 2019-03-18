package com.study.pattern.template.methodextends;

public class Test {
    public static void main(String[] args) {
        BeverageTemplate beverageTemplate = new Tea();
        beverageTemplate.prepareRecipe();

        beverageTemplate = new Coffee();
        beverageTemplate.prepareRecipe();
    }
}
