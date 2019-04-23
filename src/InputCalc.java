// Vincent Nguyen
// Operation Class
// Methods of operations for calculatorJav is here

public class InputCalc {

  private double testP1;
  private double testP2;

  public void setNum1(double num1) {
    num1 = testP1;
  }

  public double getNum1(double num1) {
    return num1;
  }

  public void setNum2(double num2) { // setters
    num2 = testP2;
  }

  public double getNum2(double num2) { // getters
    return num2;
  }

  public static double addOper(double num1, double num2) {
    double sumResult = num1 + num2;
    return sumResult;
  }

  public static double subOper(double in1, double in2) {
    double diffResult = in1 - in2;
    return diffResult;
  }

  public static double mulOper(double in1, double in2) {
    double prodResult = in1 * in2;
    return prodResult;
  }

  public static double divOper(double in1, double in2) {
    if (in2 == 0) {
      System.out.println("Please do not divide by 0, defaulting to 0");
      return 0;
    }
    double quoResult = in1 / in2;
    return quoResult;
  }


  public static double powOper(double in1, double in2) {
    double expResult = (Math.pow(in1, in2)); // uses math to do a more compact 
    return expResult;                        // version of powers and exponents
  }

  public static double randOper(double in1, double in2) {
    double randResult = (Math.random() * ((in2 - in1) + 1)) + in1;
    return randResult;
  }
  
  public static double factOper(double in1, double in2) {
   double iInt = 1;
   double factorial = 1;
    while(in1 <= in2) {
      factorial = factorial * iInt;
      iInt++;
    }
    return factorial;
  }
  

  public InputCalc(double numNum1, double numNum2) {
    testP1 = numNum1;
    testP2 = numNum2;
  }

}
