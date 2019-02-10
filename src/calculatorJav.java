// Vincent Nguyen
// This is a simple calculator which can do the 4 basic math operations and a powers operation.
// I will continue to add more functionality as I continue working on it.
import java.util.Scanner;

public class calculatorJav {

  public static void main(String[] args) {
    System.out.println("Hello Human! Enter first and second number:");
    Scanner input = new Scanner(System.in);
    String num1, num2;
    final String stateAns = "The answer is ";
     //final means that value cannot be changed. This means that stateAns is always "The Answer is "
    num1 = input.nextLine();
    num2 = input.nextLine();
    if (realNumber(num1, num2) == true) {
      double realNum1, realNum2;
      realNum1 = Double.parseDouble(num1);
      realNum2 = Double.parseDouble(num2);
      System.out.println("Enter the corresponding number for the operation. \n" + "1. Addition \n"
          + "2. Substraction \n" + "3. Multiplication \n" + "4. Division \n" + "5. Powers ");
      int choose;
      choose = input.nextInt();
      switch (choose) {
        case 1:
          System.out.println(stateAns + addOper(realNum1, realNum2));
          break;
        case 2:
          System.out.println(stateAns + subOper(realNum1, realNum2));
          break;
        case 3:
          System.out.println(stateAns + mulOper(realNum1, realNum2));
          break;
        case 4:
          System.out.println(stateAns + divOper(realNum1, realNum2));
          break;
        case 5:
          System.out.println(stateAns + powOper(realNum1, realNum2));
          break;
        default:
          System.out.println("Illegal Operation");
          input.close();
      }
    }

    else {
      System.out.println("The inputs are invalid");
      input.close();
    }
  }

  public static boolean realNumber(String testN1, String testN2) {
    try {
      Double.parseDouble(testN1);
      Double.parseDouble(testN2);
    } catch (NumberFormatException infal) {
      return false;
    }
    return true;
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

// Scope refers to variables and methods from one part of a program to another
// A variable used to store info and can be referenced in a program

