package days;

/**
 * Represents weekdays and provides a method to print the name of the day based on the code.
 * 
 * @author sivagamasrinivasan
 */
public class Weekdays {
  
  /**
   * Prints the name of the day based on the provided Day enum.
   * 
   * @param day The Day enum representing the day.
   */
  public void nameOfDay(Day day) {
    switch (day) {
      case ONE:
        System.out.println("Monday");
        break;
      case TWO:
        System.out.println("Tuesday");
        break;
      case THREE:
        System.out.println("Wednesday");
        break;
      case FOUR:
        System.out.println("Thursday");
        break;
      case FIVE:
        System.out.println("Friday");
        break;
      case SIX:
        System.out.println("Saturday");
        break;
      case SEVEN:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid day");
    }
  }

  /**
   * Prints the name of the day based on the provided code.
   * 
   * @param code The code representing the day.
   */
  public void nameOfDay(String code) {
    switch (code.toUpperCase()) {
      case "ONE":
        System.out.println("Monday");
        break;
      case "TWO":
        System.out.println("Tuesday");
        break;
      case "THREE":
        System.out.println("Wednesday");
        break;
      case "FOUR":
        System.out.println("Thursday");
        break;
      case "FIVE":
        System.out.println("Friday");
        break;
      case "SIX":
        System.out.println("
