package com.zonkidd.Decorator;

import com.zonkidd.Component.Beverage;

/**
 * 鲜奶 装饰者
 *
 * @author zonkidd
 * @create 2019-08-05
 */
public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription () + ", Milk";
    }

    public double cost(){
        return .15 + beverage.cost ();
    }
}
