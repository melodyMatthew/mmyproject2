package com.mel.ticket;

public class Ticket {
   Station start;
   Station end;
   int price;
   public Ticket(Station start,Station end){
      this.start = start;
      this.end = end;

   if(start == Station.TAIPEI_STATION )
   {if(end == Station.TAICHUNG_STATION){
      price =100;
   }else {
      price = 200;
   }

   }else if (start == Station.TAICHUNG_STATION){
      if(end== Station.TAIPEI_STATION){
         price =300;
      }else {
         price = 400;
      }
   }else if(start ==Station.KAOHSIUNG_STATION){
      if(end == Station.TAIPEI_STATION){
         price =500;
      }else {
         price = 600;
      }
   }


   public void print(){
      System.out.println(start.name +"\t"+end.name +"\t"+price);
   }

}}
