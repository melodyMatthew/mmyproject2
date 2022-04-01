package com.mel.score;

import com.mel.score.GraduatStudent;
import com.mel.score.Student;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack",20,88);
        Student hank = new Student("Hank",70,87);
        GraduatStudent jane = new GraduatStudent("Jane",65,82,44);
      //  jane.name = "Jane";
        jack.print();
        hank.print();
        jane.print();
        //String aa="tes";
         //int bb=20;
        //int cc=30;
       // Student mm = new Student(aa,bb,cc);
       // mm.print();


    }
}
