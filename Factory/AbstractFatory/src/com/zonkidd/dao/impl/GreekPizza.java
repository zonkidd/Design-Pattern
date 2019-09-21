package com.zonkidd.dao.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.service.PizzaIngredientFactory;

/**
 * GreekPizza
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class GreekPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory ;

    public  GreekPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("greekPizza prepare");
    }

    public void bake(){
        System.out.println("greekPizza bake");
    }

    public void cut(){
        System.out.println("greekPizza cut");
    }

    public void box() {System.out.println("cheesePizza box");}

}
