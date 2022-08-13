package com.sunglowsys;

public class SwitchStatement {
    public static void main(String[] args) {
        int number = 2;
        switch (number){
            case 1:
                System.out.println("samosa");

            case 2 :
                System.out.println("momos");
                break;

            case 3:
                System.out.println("burger");
                break;

            default:
                System.out.println("we wake up");
        }
    }
}
