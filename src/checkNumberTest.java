import java.util.Scanner;

public class checkNumberTest {
  public static boolean realNumber(String testN1, String testN2) {
    try {
      Double.parseDouble(testN1);
      Double.parseDouble(testN2);
    } catch (NumberFormatException infal) {
      return false;
    }
    return true;
  }



  public static void main(String[] args) {
    System.out.println("Hello Human! Enter first and second number:");
    Scanner input = new Scanner(System.in);
    String num1, num2;
    num1 = input.nextLine();
    num2 = input.nextLine();
    if (realNumber(num1, num2) == true) {
      double exNum1, exNum2;
      exNum1 = Double.parseDouble(num1);
      exNum2 = Double.parseDouble(num2);
      System.out.println("Enter the corresponding number for the operation. \n" + "1. Addition \n"
          + "2. Substraction \n" + "3. Multiplication \n" + "4. Division \n" + "5. Powers ");
      String stateAns = "The answer is ";
      int choose;
      choose = input.nextInt();
      switch (choose) {
        case 1:
          System.out.println(stateAns + addOper(exNum1, exNum2));
          break;
        case 2:
          System.out.println(stateAns + subOper(exNum1, exNum2));
          break;
        case 3:
          System.out.println(stateAns + mulOper(exNum1, exNum2));
          break;
        case 4:
          System.out.println(stateAns + divOper(exNum1, exNum2));
          break;
        case 5:
          System.out.println(stateAns + powOper(exNum1, exNum2));
          break;
        default:
          System.out.println("Illegal Operation");
      }
    } else {
      System.out.println("The inputs are invalid");
    }
    input.close();
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

