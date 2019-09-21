package com.zonkidd.Client;

import com.zonkidd.dao.Cheese;
import com.zonkidd.dao.Pizza;
import com.zonkidd.dao.impl.CheesePizza;
import com.zonkidd.service.PizzaStore;
import com.zonkidd.service.impl.ChicagoPizzaStore;
import com.zonkidd.service.impl.NYPizzaStore;

/**
 * @author zonkidd
 * @create 2019-09-20
 */
public class Client {

    public static void main(String[] args) {

       PizzaStore nypPizzaStore =new NYPizzaStore ();
        PizzaStore chicagoPizzaStore =new ChicagoPizzaStore ();

//        Pizza cheese = nyPizzaStore.orderPizza ( "cheese" );
        Pizza cheese1 = nypPizzaStore.orderPizza ( "cheese" );
        Pizza cheese2 = chicagoPizzaStore.orderPizza ( "cheese" );

        System.out.println(cheese1.toString ());
        System.out.println(cheese2.toString ());
    }
}
