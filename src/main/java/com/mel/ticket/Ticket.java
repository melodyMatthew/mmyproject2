package com.mel.ticket;

public class Ticket {
   public static final int TAIPEI_ATATION = 100;
   public static final int TAICHUNG_STATION = 200;
   public static final int KAOSIUNG_STATION = 300;


   Station start;
   Station end;
   int price;
   public Ticket(Station start,Station end) {
      this.start = start;
      this.end = end;

      if (start == Station.TAIPEI_STATION) {
         if (end == Station.TAICHUNG_STATION) {
            price = 600;
         } else {
            price = 1500;
         }

      } else if (start == Station.TAICHUNG_STATION) {
         if (end == Station.TAIPEI_STATION) {
            price = 600;
         } else {
            price = 900;
         }
      } else if (start == Station.KAOHSIUNG_STATION) {
         if (end == Station.TAIPEI_STATION) {
            price = 900;
         } else {
            price = 1500;
         }
      }
   }

   public void print(){
      System.out.println(start.name +"\t"+end.name +"\t"+price);

}}
