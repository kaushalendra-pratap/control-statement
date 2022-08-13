package com.sunglowsys;

import java.util.Scanner;

public class PositiveNefgative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x>0){
            System.out.println("x is grater than 0");
        }
        else {
            System.out.println("x is less than is 0 ");
        }
    }
}