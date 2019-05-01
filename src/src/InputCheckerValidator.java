// Vincent Nguyen
// InputChecker Class
// Checks for numbers. If symbols and characters sent, it'll return false.
// however, an exception is any number having - before itself IE -3


public class InputCheckerValidator {

  public static boolean realNumber(String testNum1) {
    try {
    //Parses inputs, if unable to be parsed, exceptions appear
      Double.parseDouble(testNum1); 
      
    } catch (Exception Unk) {
      return false;
    }
    return true;
  }


}
