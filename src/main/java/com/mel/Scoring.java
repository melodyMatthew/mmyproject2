package com.mel;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack",20,88);
        Student hank = new Student("Hank",70,87);
        GraduatStudent jane = new GraduatStudent("Jane",65,82,44);
      //  jane.name = "Jane";
        jack.print();
        hank.print();
        jane.print();
    }
}
