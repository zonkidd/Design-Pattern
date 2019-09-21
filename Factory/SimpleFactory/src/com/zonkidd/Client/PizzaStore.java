package com.zonkidd.Client;

import com.zonkidd.dao.Pizza;

/**
 * 比萨商店
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class PizzaStore {

    //现在我们为PIzzaStore加上一个SimpleFactory引用。
    SimplePizzaFactory factory;

    public PizzaStore (SimplePizzaFactory factory){
        this.factory= factory;
    }

    public Pizza orderPizza(String type){

        Pizza pizza = null;
        //orderPizza()现在可以通过传入订单类型来使用工厂创建比萨。
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }

}
