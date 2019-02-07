// Vincent Nguyen
// This is a simple calculator which can do the 4 basic math operations.

import java.util.Scanner;

public class calculatorJav {

  public static void main(String[] args) {
    System.out.println("Hello Human! Enter first and second number:");
    Scanner input = new Scanner(System.in);
    double num1, num2;
    num1 = input.nextInt();
    num2 = input.nextInt();
    System.out.println(
        "Enter the corresponding number for the operation. /n"
        + "1. Addition /n"
        + "2. Substraction /n"
        + "3. Multiplication /n"
        + "4. Division /n"
        + "5. Powers.");
    String stateAns = "The answer is ";
    int choose;
    choose = input.nextInt();
    switch (choose) {
      case 1:
        System.out.println(stateAns + addOper(num1, num2));
        break;
      case 2:
        System.out.println(stateAns + subOper(num1, num2));
        break;
      case 3:
        System.out.println(stateAns + mulOper(num1, num2));
        break;
      case 4:
        System.out.println(stateAns + divOper(num1, num2));
        break;
      case 5:
        System.out.println(stateAns + powOper(num1, num2));
        break;
      default:
        System.out.println("Illegal Operation");
        input.close();
    }
  }

  public static double addOper(double in1, double in2) {
    double result = in1 + in2;
    return result;
  }

  public static double subOper(double in1, double in2) {
    double result = in1 - in2;
    return result;
  }

  public static double mulOper(double in1, double in2) {
    double result = in1 * in2;
    return result;
  }

  public static double divOper(double in1, double in2) {
    double result = in1 / in2;
    return result;
  }

  public static double powOper(double in1, double in2) {
    double result = (Math.pow(in1, in2));
    return result;
  }
}

// TURN ALL CALCS INTO METHODS
