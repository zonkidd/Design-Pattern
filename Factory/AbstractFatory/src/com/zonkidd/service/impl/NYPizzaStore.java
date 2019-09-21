package com.zonkidd.service.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.dao.impl.CheesePizza;
import com.zonkidd.dao.impl.GreekPizza;
import com.zonkidd.dao.impl.PepperoniPizza;
import com.zonkidd.service.PizzaIngredientFactory;
import com.zonkidd.service.PizzaStore;

/**
 * NewYorkPizzaStore
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class NYPizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory ();


    public Pizza createPizza(String type){

        if(("cheese").equals(type))
        {
            pizza = new CheesePizza (ingredientFactory);
            pizza.setName ( "New York Style Cheese Pizza" );
        }
        else if(("greek").equals(type))
        {
            pizza = new GreekPizza (ingredientFactory);
        }
        else if(("pepperoni").equals(type))
        {
            pizza = new PepperoniPizza (ingredientFactory);
        }


        return pizza;
    }
}
