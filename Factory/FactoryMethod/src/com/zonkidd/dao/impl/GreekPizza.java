package com.zonkidd.dao.impl;

import com.zonkidd.dao.Pizza;

/**
 * GreekPizza
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public class GreekPizza implements Pizza {

    public  GreekPizza(){

    }
    public void prepare(){
        System.out.println("greekPizza prepare");
    }

    public void bake(){
        System.out.println("greekPizza bake");
    }

    public void cut(){
        System.out.println("greekPizza cut");
    }

    public void box() {System.out.println("cheesePizza box");}

}
