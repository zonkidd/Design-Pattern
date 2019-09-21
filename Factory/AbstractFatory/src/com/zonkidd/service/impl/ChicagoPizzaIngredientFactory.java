package com.zonkidd.service.impl;

import com.zonkidd.dao.*;
import com.zonkidd.dao.impl.*;
import com.zonkidd.service.PizzaIngredientFactory;

/**
 * 纽约原料工厂
 *
 * @author zonkidd
 * @create 2019-09-21
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough ();
    }
    public Sauce createSauce() {
        return new PlumSauce ();
    }
    public Cheese createCheese() {
        return new ReggianoCheese ();
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni ();
    }
    public Clam createClams(){
        return new FreshClams ();
    }
}
