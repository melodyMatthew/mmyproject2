package com.mel;

public class GraduatStudent extends Student{
int thisis;
    public GraduatStudent(String name,
                      int english,
                      int math,
                      int thisis){
    super(name, english, math);
    this.thisis = thisis;
}
public void print(){
        // 覆寫(Override):重寫父類別之
        System.out.println(name+"\t"+english+"\t"+math+"\t"+setAverage());
}
}
