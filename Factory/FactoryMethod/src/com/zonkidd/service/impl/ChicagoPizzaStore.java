package com.zonkidd.service.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.dao.impl.*;
import com.zonkidd.service.PizzaStore;

/**
 * ChicagoPizzaStore
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class ChicagoPizzaStore extends PizzaStore {

        Pizza pizza = null;

    public Pizza createPizza(String type){

        if(("cheese").equals(type))
        {
            pizza = new CheesePizza ();
        }

        else if(("clam").equals(type))
        {
            pizza = new ClamPizza ();
        }
        else if(("veggie").equals(type))
        {
            pizza = new VeggiePizza ();
        }

        return pizza;
    }

}
