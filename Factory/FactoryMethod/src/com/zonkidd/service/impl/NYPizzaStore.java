package com.zonkidd.service.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.dao.impl.CheesePizza;
import com.zonkidd.dao.impl.GreekPizza;
import com.zonkidd.dao.impl.PepperoniPizza;
import com.zonkidd.service.PizzaStore;

/**
 * NewYorkPizzaStore
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class NYPizzaStore extends PizzaStore {

    Pizza pizza = null;



    public Pizza createPizza(String type){

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
