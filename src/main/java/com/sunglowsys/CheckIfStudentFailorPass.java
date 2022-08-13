package com.sunglowsys;

public class CheckIfStudentFailorPass {
    public static void main(String[] args) {
         int marks = 67;
         String status = marks>=33 ? "pass" : "fail";
        System.out.println(status);
    }
}
