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

  public static boolean realNumber(String testNum1, String testNum2) {
    try {
      Double.parseDouble(testNum1);
      Double.parseDouble(testNum2);
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

/*This calculator uses int, double, String, boolean.
 * the int is used for the case code when choosing an operation
 * double is the input, the number that is to be calculated
 * string is to make a statement then the answer to save time.
 * string is also used as the input type so the boolean function can work.
 * boolean here is used to check whether the input is a number.
 */
