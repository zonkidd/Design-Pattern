package com.zonkidd.Client;

import com.zonkidd.dao.Pizza;

/**
 * 主程序
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class Client {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore ( new SimplePizzaFactory () );

        //隐藏了实例化cheesePizza的实现细节。
        Pizza cheese = pizzaStore.orderPizza ( "cheese" );
        Pizza cheese2 = pizzaStore.orderPizza ( "greek" );

    }
}
