public class MathClass {

  static int getRandomNumber(int min, int max) {
    int randomNumber = (int) (Math.random() * (max - min + 1) + min);
    return randomNumber;
  }

  public static void main(String[] arg) {
    System.out.println("learning math class");
    // getting the maximum value
    System.out.println(Math.max(23, 45));
    // getting the minimum value
    System.out.println(Math.min(45, 23));
    // getting the square root
    System.out.println(Math.sqrt(4));
    // getting the absolute value
    System.out.println(Math.abs(-4));
    // getting the power of a number
    System.out.println(Math.pow(5, 2));
    // rounding numbers
    System.out.println(Math.round(45.55));
    // rounding numbers dowo
    System.out.println(Math.floor(45.99));
    // rounding numbers up
    System.out.println(Math.ceil(45.2));
    // generating a random number
    System.out.println(getRandomNumber(23, 45));
  }
}
