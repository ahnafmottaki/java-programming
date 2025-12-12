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
    String[] registrationAndRoll = { rString, roll };
    return registrationAndRoll;
  }
}
