
//1a lEVEL 3 leap year finder using if else

import java.util.Scanner;

public class LeapYearMultipleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Please enter a year >= 1582 (Gregorian Calendar)");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Year is a Leap Year");
                    } else {
                        System.out.println("Year is NOT a Leap Year");
                    }
                } else {
                    System.out.println("Year is a Leap Year");
                }
            } else {
                System.out.println("Year is NOT a Leap Year");
            }
        }

        sc.close();
    }
}