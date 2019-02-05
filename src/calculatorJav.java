//Vincent Nguyen
//This is a simple calculator which can do the 4 basic math operations.

import java.io.*; 
import java.util.Scanner;

public class calculatorJav {
	
    public static void main(String[] args) {
    	System.out.println("Hello Human! Enter first and second number:");
        Scanner input = new Scanner(System.in);
        double num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Enter the corresponding number for the operation 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        String state = "The answer is ";
        int choose;
        choose = input.nextInt();
        switch (choose){
        case 1:
            System.out.println(state + (num1 + num2));
            break;
        case 2:
            System.out.println(state + (num1 - num2));
            break;      
        case 3:
            System.out.println(state + (num1 * num2));
            break;
        case 4:
            System.out.println(state + (num1 / num2));
            break;
            default:
                System.out.println("Illegal Operation");
                input.close();
        }
    }
}