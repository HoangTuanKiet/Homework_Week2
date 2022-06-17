package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise2 {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.print("Enter first timestamp : ");
        String firstInput = scanner.nextLine();
        System.out.print("Enter second timestamp : ");
        String secondInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        long days = ChronoUnit.DAYS.between(secondDate, firstDate);
        System.out.println("Days between: " + days);
    }
}
