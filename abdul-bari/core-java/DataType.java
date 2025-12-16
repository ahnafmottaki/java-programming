import java.util.ArrayList;

public class DataType {

  public static void main(String args[]) {
    System.out.println("Data types in java");
    System.out.print("Primitive data types are: ");
    System.out.println("byte, short, int, long, float, double, char, boolean");
    System.out.println(
      "Non-primitive data types are: String, Arrays , classes"
    );
    // byte range -> -128 to 127
    byte age = 20;
    short salary = 342;
    int population = 1000000;
    long population2 = 1000000000000000000L;
    float pi = 3.14f;
    double pi2 = 3.14159265358979323846d;
    char gender = 'M';
    boolean isMarried = false;
    // Scientific numbers
    float scientificNumber = 1.23e4f;
    double scientificNumber2 = 1.23e4d;
    int number;
    // you cannot use a variable before it is initialized
    number = 456;
    System.out.println(number);

    // the var keyword
    // it let's you declare variables without specifying the type\
    var varNumber = 34;
    var listItems = new ArrayList<String>();
  }
}
