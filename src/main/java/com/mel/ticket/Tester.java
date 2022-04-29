package com.mel.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
  //      Ticket ticket01 = new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1: Taipei,2: Taichung,3: Kaohsiung )");
        Station start = null;
        int choice = Integer.parseInt(scanner.next());
        switch (choice) {
            case 1:
                start = Station.TAIPEI_STATION;
            case 2:
                start = Station.TAICHUNG_STATION;
            case 3:
                start = Station.KAOHSIUNG_STATION;
                break;
    }


        System.out.println("Your end station?(1: Taipei,2: Taichung,3: Kaohsiung )");
        choice = Integer.parseInt(scanner.next());
        Station end = null;
        switch (choice) {
            case 1:
                end = Station.TAIPEI_STATION;
            case 2:
                end = Station.TAICHUNG_STATION;
            case 3:
                end = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Which kind if ticket do you want? 1)normal. 2)student. 3)elder.");
        choice= Integer.parseInt(scanner.next());
        Ticket ticket  = null;
        switch (choice){
            case 1:
                ticket = new Ticket(start, end);
                break;
            case 2:
                ticket = new StudentTicket(start, end);
                break;
        }
        ticket.print();
}}
