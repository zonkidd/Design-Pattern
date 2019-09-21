package com.zonkidd.Client;

import com.zonkidd.dao.Pizza;
import com.zonkidd.dao.impl.CheesePizza;
import com.zonkidd.dao.impl.GreekPizza;
import com.zonkidd.dao.impl.PepperoniPizza;

/**
 * 简单工厂类
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        //需求有变化时，需要改变这里的代码。
        if(("cheese").equals(type))
        {
            pizza = new CheesePizza ();
        }
        else if(("greek").equals(type))
        {
            pizza = new GreekPizza ();
        }
        else if(("pepperoni").equals(type))
        {
            pizza = new PepperoniPizza ();
        }
        return pizza;
    }

}
