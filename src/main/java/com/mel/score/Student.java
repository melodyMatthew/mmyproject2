package com.mel.score;

public class Student {
    String name;
    int english;
    int math;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name,int english,int math){
        this(name);
     //   this.name = name;
        this.english = english;
        this.math = math;
    }
    public Student(){
        this("John Doe",-1,-1);

    }

    public void print(){
        int average = (english+math)/2;
       // System.out.println(name+english+math+average);
        System.out.print(name+"\t"+english+"\t"+math+"\t"+setAverage());
        if (average<60){
            System.out.print("*");
        }
         System.out.println();
    }
    public int setAverage(){
        return (english+math)/2;
    }

}
