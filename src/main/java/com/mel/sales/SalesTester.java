package com.mel.sales;
//normal costomer -buy 1000 give 100
//silver costomer -buy 1000 give 100,and hundred give back money
//added offer
//plati costemer -buy 1000 give 300,and 200 give back
//c1 1200 1100
//c2 800 800
//c3 2000 1800(200) <--銀級客戶

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {

        List<Costomer> customers = new ArrayList<>();
        customers.add(new Costomer("001", 1200));
        customers.add(new Costomer("002", 700));
        customers.add(new SilverCustomer("003",2000));
    //    platiCustomer c7 = new platiCustomer("007",2300);
     //   c7.print();
        for (int i = 0;i<5;i++){
            customers.get(i).print();
        }
        for(Costomer c:customers){
            c.print();
        }
      //  String addID;
    //    int addAMM;

     //   Scanner scanner = new Scanner(System.in);
      //  System.out.print("input new ID/ammount(seperate with space):");
      //  addID = scanner.nextLine();
      //  addAMM = scanner.nextInt();
      //  Costomer c4 = new Costomer(addID,addAMM);
        //c4.print();


    }
}
