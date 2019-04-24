// Vincent Nguyen
// This is a simple calculator which can do the 4 basic math operations and a powers operation.
// I will continue to add more functionality as I continue working on it.
import java.util.InputMismatchException;
import java.util.Scanner;

public class calculatorJav {

  public static void main(String[] args) {
    System.out.println("Hello Human! \n"
        + "Enter first and second number(input - before the number to make it negative):");
    Scanner input = new Scanner(System.in);
    String num1, num2;
    final String stateAns = "The answer is ";
    // final means that value cannot be changed. This means that stateAns is always "The Answer is "
    num1 = input.nextLine();
    num2 = input.nextLine();
    if (InputChecker.realNumber(num1, num2) == true) {
      double realNum1, realNum2;
      realNum1 = Double.parseDouble(num1);
      realNum2 = Double.parseDouble(num2);
      double arr[] = {realNum1, realNum2}; // the array has the parsed numbers in its array
      double nthTerm = arr.length; // nth is how long the array is
      System.out.println("Enter the corresponding number for the operation. \n" + "1. Addition \n"
          + "2. Substraction \n" + "3. Multiplication \n" + "4. Division \n" + "5. Powers \n"
          + "6. Random Number (between input values) \n" + "7. Factorials \n"
          + "8. Variance and Standard Deviation (Population) \n");
      int choose;
      try {
        choose = input.nextInt();
        switch (choose) {
          case 1:
            System.out.println(stateAns + InputCalc.addOper(realNum1, realNum2));
            break;
          case 2:
            System.out.println(stateAns + InputCalc.subOper(realNum1, realNum2));
            break;
          case 3:
            System.out.println(stateAns + InputCalc.mulOper(realNum1, realNum2));
            break;
          case 4:
            System.out.println(stateAns + InputCalc.divOper(realNum1, realNum2));
            break;
          case 5:
            System.out.println(stateAns + InputCalc.powOper(realNum1, realNum2));
            break;
          case 6:
            System.out.println(stateAns + InputCalc.randOper(realNum1, realNum2));
            break;
          case 7:
            System.out.println(stateAns + InputCalc.factOper(realNum1)); // calculates factorial for
                                                                         // 1st input
            System.out.println(stateAns + InputCalc.factOper(realNum2)); // calculates factorial for
                                                                         // 2nd input
            break;
          case 8:
            System.out.println(stateAns + StatsCalc.varOp(arr, nthTerm)); // mean is just a means to
                                                                          // find variance.
            System.out.println(stateAns + StatsCalc.stdDev(arr, nthTerm));
            break;
          default:
            System.out.println("Illegal Operation"); //defaults only when a number that is not not the case list.
            input.close();
        }

      } catch (InputMismatchException charAndSym) {
        System.out.println("You can't input characters or symbols. Although - and + will work \n"
            + "This includes characters with numbers or symbols with numbers I.E. 5^ or 2x");
      } catch (Exception noIdea) {
        System.out.println("Please contact me at 239-848-0059");
      }
    }


    else {
      System.out.println("The inputs are invalid, please don't use characters or symbols.\n"
          + "Although, negative numbers can be represented via -4 or -20.");
      input.close();
    }
  }

}
// Scope refers to variables and methods from one part of a program to another
// A variable used to store info and can be referenced in a program

/*
 * This calculator uses int, double, String, boolean. the int is used for the case code when
 * choosing an operation double is the input, the number that is to be calculated string is to make
 * a statement then the answer to save time. string is also used as the input type so the boolean
 * function can work. boolean here is used to check whether the input is a number.
 */
