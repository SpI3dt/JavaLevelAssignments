//problem 2 level 1 week 5-6

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

    
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

    
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    System.out.println(nums[i] + " is positive and even.");
                } else {
                    System.out.println(nums[i] + " is positive and odd.");
                }
            } 
            else if (nums[i] < 0) {
                System.out.println(nums[i] + " is negative.");
            } 
            else {
                System.out.println(nums[i] + " is zero.");
            }
        }


        int first = nums[0];
        int last = nums[nums.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal.");
        } 
        else if (first > last) {
            System.out.println("First element is greater than last.");
        } 
        else {
            System.out.println("First element is less than last.");
        }

        sc.close();
    }
}