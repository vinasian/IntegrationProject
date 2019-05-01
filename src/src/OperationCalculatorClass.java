// Vincent Nguyen
// Operation Class
// Methods of operations for calculatorJav is here



public class OperationCalculatorClass {

  private double num1, num2;

  public OperationCalculatorClass(double n1, double n2) {}

  public double getNum1() {
    return num1;
  }

  public void setNum1(double num1) {
    this.num1 = num1;
  }

  double getNum2() {
    return num2;
  }

  public void setNum2(double num2) {
    this.num2 = num2;
  }

  public void op(double n1) {
    this.setNum1(n1);
    this.setNum2(0);
  }

  public void op(double n1, double n2) {
    this.setNum1(n1);
    this.setNum2(n2);
  }

  // parameters in this case is in1 and in2.
  // public static double addOper(double in1, double in2) is the header
  public double addOper(double in1, double in2) {

    // addition operator adds both inputs together
    double sumResult = in1 + in2;
    return sumResult;
  }

  public double subOper(double in1, double in2) {
    
    // subtraction operator to find difference
    double diffResult = in1 - in2; 
    return diffResult;
  }

  public double mulOper(double in1, double in2) {
    
    // multiple operator to find product
    double prodResult = in1 * in2;
    return prodResult;
  }

  public double divOper(double in1, double in2) {
    if (in2 == 0) {

      // diving by 0 is bad so this prevents it from doing so.
      System.out.println("Please do not divide by 0, defaulting to 0");

      // returning to 0 so we don't do division of 0.
      return 0;
    } else {
      double quoResult = in1 / in2;
      return quoResult;
    }
  }


  public double powOper(double in1, double in2) {
    if (in1 == 0) {

      // 0 to the negative power is undefined
      System.out.println("Undefined, defaulting to 0");

      // returning 0.
      return 0;
    } else {
      double expResult = (Math.pow(in1, in2)); // uses math to do a more compact
      return expResult; // version of powers and exponents
    }
  }

  public double randOper(double in1, double in2) {
    double randResult = (Math.random() * ((in2 - in1) + 1)) + in1;
    
    // Function above finds random number between both inputs.
    return randResult;
  }

  public double factOper(double in1) {
    double iInt = 1;
    double factorial = 1; // Factorial function using while loops.

    while (iInt <= in1) { // We can use for loops for the factorial as well.
      factorial = factorial * iInt;
      iInt++;
    }
    return factorial;
  }

  public double varOp(double a[], double nTerm) {
    double sum = 0;
    // Computing average/mean
    for (int i = 0; i < nTerm; i++)
      sum += a[i];
    double mean = (double) sum / (double) nTerm;

    // Computing sum squared differences with the mean
    double sqrDiff = 0;
    for (int i = 0; i < nTerm; i++)
      sqrDiff += (a[i] - mean) * (a[i] - mean);
    
    //note this is population variance
    return (double) sqrDiff / nTerm;
  }
  
  public double stdDev(double arr[], double n) {
    // Standard Deviation is easy since we have variance.
    return Math.sqrt(varOp(arr, n));
  }
}


