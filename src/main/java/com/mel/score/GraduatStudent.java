package com.mel.score;

import com.mel.score.Student;

public class GraduatStudent extends Student {
int thisis;
    public GraduatStudent(String name,
                      int english,
                      int math,
                      int thisis){
    super(name, english, math);
    this.thisis = thisis;
}
//overide
public void print(){

        System.out.println(name+"\t"+english+"\t"+math+"\t"+setAverage()+"\t"+thisis);
}
}
