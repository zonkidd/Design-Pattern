package com.zonkidd.Client;

import com.zonkidd.dao.Pizza;
import com.zonkidd.service.PizzaStore;
import com.zonkidd.service.impl.ChicagoPizzaStore;
import com.zonkidd.service.impl.NYPizzaStore;

/**
 * @author zonkidd
 * @create 2019-09-20
 */
public class Client {

    public static void main(String[] args) {

        PizzaStore pizzaStore =new ChicagoPizzaStore ();

//        Pizza cheese = nyPizzaStore.orderPizza ( "cheese" );
        Pizza cheese2 = pizzaStore.orderPizza ( "cheese" );
    }
}
