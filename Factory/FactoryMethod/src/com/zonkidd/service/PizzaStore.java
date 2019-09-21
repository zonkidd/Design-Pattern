package com.zonkidd.service;

import com.zonkidd.dao.Pizza;

/**
 * 抽象比萨商店
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public  abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        //createPizza()方法从工厂对象中回到PizzaStore
        pizza = createPizza(type);
        if(pizza == null)
            throw new NullPointerException("pizza == null");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
    //现在把工厂对象移到这个方法中。 注意是抽象方法。
    protected abstract Pizza createPizza(String type);

}
