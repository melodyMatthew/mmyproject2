package com.mel;

import javax.xml.namespace.QName;

public class GCosT extends CosT{
    int lev;
    public GCosT(int id,String name,int pay,int lev) {
        super(id, name, pay);
this.lev = lev;
    }
//overide
public void print(){

    int Cpay = pay-(pay%100);;
    int get=(Cpay/1000)*100*lev;

    System.out.println("Gcos:"+name +"/"+"Gid:"+id+" special get "+get);
}}

