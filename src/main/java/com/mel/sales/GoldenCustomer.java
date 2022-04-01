package com.mel.sales;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String id,int ammount){
        super(id, ammount);
        off = 0.2f;
    }
    //override
    public void print(){
      //  System.out.print();
    }
}
