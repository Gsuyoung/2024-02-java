package com.green.practice;

public class Practice2 {
    public static void main(String[] args) {
        Grade grade = new Grade("강백호",90.0,85.5,70.0);
        Grade grade1 = new Grade("채치수",82.0,92.0,60.5);
        System.out.println(grade);


    }
}
class Grade {
    String name;
    double language;
    double math;
    double english;

    public Grade(String name, double language, double math, double english) {
        this.name = name;
        this.language = language;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public double getLanguage() {
        return language;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }
}
