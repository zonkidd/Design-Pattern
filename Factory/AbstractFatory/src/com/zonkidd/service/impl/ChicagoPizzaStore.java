package com.zonkidd.service.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.dao.impl.*;
import com.zonkidd.service.PizzaIngredientFactory;
import com.zonkidd.service.PizzaStore;

/**
 * ChicagoPizzaStore
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class ChicagoPizzaStore extends PizzaStore {

        Pizza pizza = null;
        //实现即自定义原料，又能统一标准（从ChicagoPizzaIngredientFactory提供）。
        PizzaIngredientFactory ingredientFactory= new ChicagoPizzaIngredientFactory ();

    public Pizza createPizza(String type){

        if(("cheese").equals(type))
        {
            pizza = new CheesePizza (ingredientFactory);
            pizza.setName ( "Chicago Style Cheese Pizza" );
        }
        else if(("clam").equals(type))
        {
            pizza = new GreekPizza (ingredientFactory);
        }
        else if(("veggie").equals(type))
        {
            pizza = new VeggiePizza (ingredientFactory);
        }

        return pizza;
    }

}
