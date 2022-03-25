package com.mel.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
  //      Ticket ticket01 = new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1: Taipei,2: Taichung,3: Kaohsiung )");
        Station startStation = null;
        int choice = Integer.parseInt(scanner.next());
        switch (choice) {
            case 1:
                startStation = Station.TAIPEI_STATION;
            case 2:
                startStation = Station.TAICHUNG_STATION;
            case 3:
                startStation = Station.KAOHSIUNG_STATION;
    }

        Station endStation = null;
        System.out.println("Your end station?(1: Taipei,2: Taichung,3: Kaohsiung )");
        switch (choice) {
            case 1:
                endStation = Station.TAIPEI_STATION;
            case 2:
                endStation = Station.TAICHUNG_STATION;
            case 3:
                endStation = Station.KAOHSIUNG_STATION;
        }
}}
