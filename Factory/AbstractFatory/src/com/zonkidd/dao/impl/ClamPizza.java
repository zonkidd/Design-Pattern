package com.zonkidd.dao.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.service.PizzaIngredientFactory;

/**
 * 芝士比萨
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory ;

   public ClamPizza(PizzaIngredientFactory ingredientFactory){
       this.ingredientFactory = ingredientFactory;
   }

    public void prepare() {
       System.out.println("clamPizza prepare");
    }

    public void bake(){
       System.out.println("clamPizza bake");
    }

    public void cut(){
       System.out.println("clamPizza cut");
    }

    public void box(){System.out.println("clamPizza box");}
}
