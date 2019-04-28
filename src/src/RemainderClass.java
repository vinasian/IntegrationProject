
public class RemainderClass extends OperationCalculatorClass {

  public RemainderClass(double n1, double n2) {
    super(n1, n2);
  }

  public double divOper(double in1, double in2) {
    if (in2 == 0) { //diving by 0 is bad so this prevents it from doing so.
      System.out.println("Impossible remainder");
      return 0; //returning to 0 so we don't do division of 0.
    } else {
    double partResult = in1 % in2;
    return partResult;
    }
  }
}


