package com.zonkidd.dao.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.service.PizzaIngredientFactory;

/**
 * PepperoniPizza
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class PepperoniPizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

   public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
    this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){System.out.println("pepperoniPizza prepare");}

    public void bake(){System.out.println("pepperoniPizza bake");}

    public void cut(){System.out.println("PepperoniPizza cut");}

    public void box(){System.out.println("PepperoniPizza box");}


}
