package com.zonkidd.dao;

import com.zonkidd.dao.*;

/**
 * 抽象比萨类
 *
 * @author zonkidd
 * @create 2019-09-20
 */
public abstract class Pizza {

    protected Dough dough ;
    protected Sauce sauce ;
    protected Cheese cheese ;
    protected Pepperoni pepperoni ;
    protected Clam clams ;
    protected  String name;

    public abstract  void prepare();

    public void bake(){
        System.out.println("Bake()");
    }

    public void cut(){
        System.out.println("Cut()");
    }

    public void box(){System.out.println("Box()");}


    public String getName(){
       return name;
    }

   public void setName(String name){
       this.name =name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "\ndough=" + dough +
                "\n, sauce=" + sauce +
                "\n, cheese=" + cheese +
                "\n, pepperoni=" + pepperoni +
                "\n, clams=" + clams +
                "\n, name='" + name + '\'' +
                '}';
    }
}
