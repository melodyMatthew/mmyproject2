package com.mel;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack");
        jack.english = 60;
        jack.math = 88;
        Student hank = new Student("Hank",70,87);
        jack.print();
        hank.print();
    }
}
