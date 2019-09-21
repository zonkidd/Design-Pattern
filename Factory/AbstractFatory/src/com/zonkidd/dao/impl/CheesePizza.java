package com.zonkidd.dao.impl;

import com.zonkidd.dao.Pizza;
import com.zonkidd.service.PizzaIngredientFactory;

/**
 * 芝士比萨
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class CheesePizza  extends Pizza {

    //原料工厂 ，持有原料工厂
    PizzaIngredientFactory ingredientFactory;

   public CheesePizza(PizzaIngredientFactory ingredientFactory){
       this.ingredientFactory = ingredientFactory;
   }


   public void prepare() {

       System.out.println("Preparing "+name);
       //原料用ingredientFactory提供。
       dough = ingredientFactory.createDough ();
       sauce = ingredientFactory.createSauce ();
       cheese = ingredientFactory.createCheese ();
    }

    public void bake(){
       System.out.println("cheesePizza bake");
    }

    public void cut(){
       System.out.println("cheesePizza cut");
    }

    public void box(){System.out.println("cheesePizza box");}

    public String getName(){
       return name;
    }

    public void setName(String name){
       this.name = name;
    }
}
