import java.util.Scanner;

public class problem3level3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
		
        double number1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double temp = number1;
        number1 = number2;
        number2 = temp;
        
        System.out.println("The swapped numbers are " + number1 +" and " + number2);
        
        sc.close();
    }
}