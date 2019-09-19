package com.zonkidd.Client;

import com.zonkidd.Component.Beverage;
import com.zonkidd.Component.TaroMilkTea;
import com.zonkidd.Component.TruffleCocoa;
import com.zonkidd.Component.CheeseStrawberry;
import com.zonkidd.Decorator.Cheese;
import com.zonkidd.Decorator.Milk;
import com.zonkidd.Decorator.Whip;


/**
 * @author zonkidd
 * @create 2019-08-05
 */
public class HiTea {
    public static void main(String[] args) {
        Beverage beverage =new TaroMilkTea ();
        System.out.println(beverage.getDescription () +  " $" + beverage.cost ());

        //饮料2 加了双倍芝士和奶泡
        Beverage beverage2= new TruffleCocoa ();
        //把TruffleCocoa当做被装饰者传入到Cheese中
        beverage2 =new Cheese ( beverage2 );
        //把Cheese(TrffuleCocoa)当做被装饰者传入到Cheese中
        beverage2 =new Cheese ( beverage2 );
        //把Cheese(Cheese(TrffuleCocoa))当做被装饰者传入到Whip中
        beverage2 =new Whip ( beverage2 );
        //最后的beverage2 应该是Whip(Cheese(Cheese(TrffuleCocoa)))

        System.out.println(beverage2.getDescription () +  " $" + beverage2.cost ());

        //饮料3 加了鲜奶、芝士和奶泡
        Beverage beverage3 = new CheeseStrawberry ();
        beverage3 = new Milk ( beverage3 );
        beverage3 = new Cheese ( beverage3 );
        beverage3 = new Whip ( beverage3 );
        System.out.println(beverage3.getDescription () +  " $" + beverage3.cost ());

    }

}
