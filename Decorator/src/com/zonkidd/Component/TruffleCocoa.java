package com.zonkidd.Component;

/**
 * 松露可可 具体组件
 *
 * @author zonkidd
 * @create 2019-08-04
 */
public class TruffleCocoa extends Beverage{

    public TruffleCocoa(){
        //结束套娃，开始回调
        description = "TruffleCocoa";
    }

    public double cost(){
        return .99;
    }

}
