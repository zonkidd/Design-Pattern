package com.zonkidd.Decorator;

import com.zonkidd.Component.Beverage;

/**
 * 芝士 装饰者
 * Cheese是一个装饰者，所以让它扩展自CondimentDecorator
 * @author zonkidd
 * @create 2019-08-05
 */

public class Cheese extends CondimentDecorator{

    /**
     * 要让Cheese能够引用一个Beverage,做法如下：
     * (1)用一个实例变量记录饮料，也就是被装饰者
     * (2)想办法让装饰者(饮料)被记录在实例变量中。这里的做法是：
     * 把饮料(Beverage)当做构造器的参数，再由构造器将此饮料记录在实例变量中。
     */

    //被装饰者
    Beverage beverage;

    public Cheese(Beverage beverage){
        this.beverage=beverage;
    }
    /**
     *我们希望叙述不只是描述饮料( TruffleCocoa)，而是完整地连调料都描述出来（TruffleCocoa，Cheese）
     *所以利用委托（delegate）的做法，得到一个叙述，然后在其后加上附加的叙述（例如"，Cheese"）
     */
    public String getDescription(){
        //Cheese@532的getDescription()中 TruffleCocoa也要调用的getDescription()
        return beverage.getDescription () + "，Cheese";

    }
    /**
     * 要计算带Cheese饮料的价钱。
     * 首先调用被装饰者对象(beverage)计算价钱，再加上Cheese的价钱。
     */
    public double cost(){
        return .20 + beverage.cost ();
    }
}
