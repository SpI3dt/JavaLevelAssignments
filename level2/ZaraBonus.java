//week 5 - 6 level 2 problem 1

import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SIZE = 10;

        double[] salary = new double[SIZE];
        double[] years = new double[SIZE];
        double[] bonus = new double[SIZE];
        double[] newSalary = new double[SIZE];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        
        for (int i = 0; i < SIZE; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            years[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // repeat this iteration
                continue;
            }
        }

      
        for (int i = 0; i < SIZE; i++) {
            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n----- FINAL REPORT -----");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}