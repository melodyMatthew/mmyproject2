package com.mel.sales;

public class platiCustomer extends SilverCustomer{

    public platiCustomer(String id,int ammount){
        super(id, ammount);
    }
    public float backMoney(){
        return (ammount/100)*off *100;
    }
    public void print(){
        System.out.println(id+"\t"+ammount+"\t"+(ammount-backMoney()*3)+"("+backMoney()*2+")");

    }

}
