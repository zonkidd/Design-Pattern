package com.zonkidd.dao.impl;

import com.zonkidd.dao.Pizza;

/**
 * 芝士比萨
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class CheesePizza implements Pizza {

   public CheesePizza(){}

    public void prepare() {
       System.out.println("cheesePizza prepare");
    }

    public void bake(){
       System.out.println("cheesePizza bake");
    }

    public void cut(){
       System.out.println("cheesePizza cut");
    }
}
