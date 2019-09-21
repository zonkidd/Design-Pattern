package com.zonkidd.dao.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.service.PizzaIngredientFactory;

/**
 * 芝士比萨
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;
   public VeggiePizza(PizzaIngredientFactory ingredientFactory){
    this.ingredientFactory = ingredientFactory;
   }

    public void prepare() {
       System.out.println("VeggiedPizza prepare");
    }

    public void bake(){
       System.out.println("veggiePizza bake");
    }

    public void cut(){
       System.out.println("veggiePizza cut");
    }

    public void box(){System.out.println("veggiePizza box");}
}
