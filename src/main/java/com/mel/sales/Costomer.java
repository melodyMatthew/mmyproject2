package com.mel.sales;

public class Costomer {
    String id;
    int ammount;
    float off = 0.1f;
    public Costomer(String id,int ammount){
        this.id = id;
        this.ammount= ammount;
    }
    public float backMoney(){
        return (ammount/1000)*off*1000;
    }
    //
    public void print(){
      //  float offmoney =(amount/1000)?off;
        System.out.println(id+"\t"+ammount+"\t"+(ammount-backMoney()));

    }
    public void pprint(){

    }
    public void add(){

    }
}
