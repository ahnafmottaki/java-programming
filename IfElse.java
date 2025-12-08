public class IfElse {

  public static void main(String arg[]) {
    boolean isRaining = true;
    if (isRaining) {
      System.out.println(
        "It is raining today! Make sure to bring an umbrella."
      );
    } else {
      System.out.println("No need to worry. Today won't rain.");
    }

    // ternary operator
    int time = 18;
    String message = time < 18 ? "Good day" : "Good evening";
    System.out.println(message);

    // switch statement
    int dayOfWeek = 3;
    switch (dayOfWeek) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        break;
    }
  }
}
