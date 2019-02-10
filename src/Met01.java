// Vincent Nguyen
// Test for Repl.it in Methods 1


public class Met01 {
  public static void main(String[] args) {
    double length = 5.0;
    double width = 2.5;
    System.out.println(calculateArea(length, width));
  }

  public static double calculateArea(double side1, double side2) {
    double area;
    area = side1 * side2;
    return area;
  }
}
