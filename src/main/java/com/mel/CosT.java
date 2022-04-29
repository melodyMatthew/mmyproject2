package com.mel;

public class CosT {
    int id;
    String name;
    int pay;

    public CosT(int id,String name,int pay){
        this.id = id;
        this.name=name;
        this.pay = pay;

    }
    public void print(){
        int Cpay = pay-(pay%100);
        int get=(Cpay/1000)*100;

        System.out.println("cos:"+name +"/"+"id:"+id+" get "+get);

    }




}
