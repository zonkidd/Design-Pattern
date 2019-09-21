package com.zonkidd.service;

import com.zonkidd.dao.*;
/**
 * 抽象原料工厂
 * */
public interface PizzaIngredientFactory {

     Dough createDough();

     Sauce createSauce();

     Cheese createCheese();

     Pepperoni createPepperoni();

     Clam createClams();

}
