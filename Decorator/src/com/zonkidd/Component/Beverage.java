package com.zonkidd.Component;

/**
 * @author zonkidd
 * @create 2019-08-05
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        //Cheese@531的实例变量TruffleCocoa的getDescription()
        return description;
    }

    public abstract double cost();
}
