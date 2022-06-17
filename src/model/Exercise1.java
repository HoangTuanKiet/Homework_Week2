package model;

import utils.Month;

import java.util.*;

public class Exercise1 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your input: ");
        int input = scanner.nextInt();
        System.out.println("Switch-case:");
        excuteWithSwitch(input);
        System.out.println("For loop:");
        excuteWithForLoop(input);
    }

    public static void excuteWithSwitch(int input){
        switch (input) {
            case 1:
                System.out.println(toString(Month.JANUARY));
                break;
            case 2:
                System.out.println(toString(Month.FEBRUARY));
                break;
            case 3:
                System.out.println(toString(Month.MARCH));
                break;
            case 4:
                System.out.println(toString(Month.APRIL));
                break;
            case 5:
                System.out.println(toString(Month.MAY));
                break;
            case 6:
                System.out.println(toString(Month.JUNE));
                break;
            case 7:
                System.out.println(toString(Month.JULY));
                break;
            case 8:
                System.out.println(toString(Month.AUGUST));
                break;
            case 9:
                System.out.println(toString(Month.SEPTEMBER));
                break;
            case 10:
                System.out.println(toString(Month.OCTOBER));
                break;
            case 11:
                System.out.println(toString(Month.NOVEMBER));
                break;
            case 12:
                System.out.println(toString(Month.DECEMBER));
                break;
            default:
                System.out.println("Khong co thang nao ca");
                break;
        }
    }

    public static void excuteWithForLoop(int input){
        if (input == 1 || input == 3 || input == 5 || input == 7 ||input == 8 ||input == 10 || input == 12){
            System.out.println("Thang " + input + " : 31 ngay");
        }else if (input == 4 || input == 6 || input == 9 || input == 11){
            System.out.println("Thang " + input + " : 31 ngay");
        }else if (input == 2){
            System.out.println("Thang " + input + " : 28 ngay");
        }else {
            System.out.println("Khong co thang nao ca");
        }
    }
    public static String toString (Month month){
        return month + " : " + month.getDays() + " days";
    }
}
