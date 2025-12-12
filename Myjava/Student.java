package Myjava;

public class Student {

  private String registrationNo;
  protected String roll;
  public String name;
  String department;
  private static double serialCount = 0;

  public String getRegistrationNo() {
    return registrationNo;
  }

  public Student(String name, String department) {
    this.name = name;
    this.department = department;
    String[] regAndRoll = generateRegistrationAndRoll();
    this.registrationNo = regAndRoll[0];
    this.roll = regAndRoll[1];
  }

  private static String[] generateRegistrationAndRoll() {
    String roll = "Math-" + serialCount;
    String rString = ("my-student-" + serialCount++);
    return new String[] { rString, roll };
  }

  public static void helloWorld() {
    System.out.println("Hello World");
  }

  protected static void protectedMethod() {
    System.out.println("this is a protected method");
  }

  static void defaultMethod() {
    System.out.println("this is a default method");
  }

  protected class MyInnerProtectedClass {

    public MyInnerProtectedClass() {
      System.out.println("this is my inner protected");
    }
  }

  class MyInnerPackagePrivateClass {

    public MyInnerPackagePrivateClass() {
      System.out.println("this is inner package private");
    }
  }
}

class Mytest {}
