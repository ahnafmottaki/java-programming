import Myjava.*;
import Myjava.inner.TestModifierTwo;

public class Array {

  public String name = "ahnaf";
  static int age = 23;

  public void add() {
    //        showMessage();
    //        return 45 + 56;
    age += 10;
  }

  static void showMessage() {
    System.out.println("Welcome to the ultimate java course");
  }

  static void showOptions() {
    showMessage();
    System.out.println("option 1: Add item");
  }

  public static void main(String[] args) {
    TestModifierOne d1 = new TestModifierOne();
    d1.display();
    TestModifierTwo d2 = new TestModifierTwo();
    d2.show();
    System.out.println("We will learn about array in this lecture");
    //        creating an array
    String[] cars = { "Volvo", "Bmw", "Ford", "Mazda" };
    //        accessing the element of an array
    System.out.println(cars[0]);
    //        changing array element
    cars[1] = "BMW";
    System.out.println(cars[1]);
    //        getting the length of an array
    System.out.println("The length of the cars array is : " + cars.length);

    String[] carsTwo = new String[] {
      "ahnaf",
      "mottaki",
      "morshed",
      "sarker",
      "arpon",
    };
    System.out.println(carsTwo[0]);

    int[][] myNumbers = { { 1, 4, 2 }, { 3, 6, 8, 5, 2 } };
    for (int row = 0; row < myNumbers.length; ++row) {
      for (int col = 0; col < myNumbers[row].length; ++col) {
        System.out.println(myNumbers[row][col]);
      }
    }

    for (int[] row : myNumbers) {
      for (int col : row) {
        System.out.println(col);
      }
    }
    showOptions();
  }
}
