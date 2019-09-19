package com.zonkidd.Decorator;

import com.zonkidd.Component.Beverage;

/**
 * 奶泡 装饰者
 *
 * @author zonkidd
 * @create 2019-08-05
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        //发现getDescription()中要调用实例变量(Cheese@532)的getDescription()
        return beverage.getDescription () + ", Whip";
    }

    public double cost(){
        return .10 + beverage.cost ();
    }
}
