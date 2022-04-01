package com.mel.sales;

public class SilverCustomer extends Costomer {
    
    public SilverCustomer(String id,int ammount){
        super(id, ammount);
    }
    //overide
    public void print(){
        System.out.println(id+"\t"+ammount+"\t"+(ammount-backMoney())+"("+backMoney()+")");

    }
}
