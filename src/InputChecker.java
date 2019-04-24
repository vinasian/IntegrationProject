// Vincent Nguyen
// InputChecker Class
// Checks for numbers. If symbols and characters sent, it'll return false.
// however, an exception is any number having - before itself IE -3


public class InputChecker {

  public static boolean realNumber(String testNum1, String testNum2) {
    try {
      Double.parseDouble(testNum1);  //Parses inputs
      Double.parseDouble(testNum2);  //if unable to be parsed, exceptions appear
    } catch (NumberFormatException infal) {
      return false;
    } catch (Exception Unk) {
      return false;
    }
    return true;
  }

}
