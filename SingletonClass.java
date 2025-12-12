import java.util.Date;

public class SingletonClass {

  public static void main(String[] args) {
    CoffeeMachine c1 = CoffeeMachine.getInstance();
    CoffeeMachine c2 = CoffeeMachine.getInstance();
    CoffeeMachine c3 = CoffeeMachine.getInstance();
    System.out.println(c1 + " " + c2 + " " + c3);
    if (c1 == c2 && c1 == c3) {
      System.out.println("Same");
    }
    Date d = new Date();
    System.out.println(d.toString());
  }
}

class Student {

  private String rollNo;
  private String department;
  private static int count = 1;

  private String generateRollNo() {
    Date d = new Date();
    String roll = "univ-" + (d.getTime() + 1900) + "-" + count++;
    return roll;
  }

  public Student() {
    rollNo = generateRollNo();
  }
}

class CoffeeMachine {

  private float quantity;
  private float waterQty;
  private static CoffeeMachine our = null;

  private CoffeeMachine() {
    quantity = 1;
    waterQty = 1;
  }

  public void fillWater() {
    quantity = 10;
  }

  public static CoffeeMachine getInstance() {
    if (our == null) {
      our = new CoffeeMachine();
    }
    return our;
  }
}
