package com.zonkidd.dao.impl;

import com.zonkidd.dao.Pizza;

/**
 * 芝士比萨
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class VeggiePizza implements Pizza {

   public VeggiePizza(){}

    public void prepare() {
       System.out.println("veggiePizza prepare");
    }

    public void bake(){
       System.out.println("veggiePizza bake");
    }

    public void cut(){
       System.out.println("veggiePizza cut");
    }

    public void box(){System.out.println("veggiePizza box");}
}
