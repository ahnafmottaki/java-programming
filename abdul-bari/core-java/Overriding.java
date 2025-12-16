public class Overriding {

  public static void main(String[] args) {
    Super s1 = new Sub();
    s1.display();
    InnerOverriding i1 = new InnerOverriding();
    System.out.println(i1.name);
    SubSubInnerOverriding sb1 = new SubSubInnerOverriding();
    System.out.println(sb1.name);
  }
}

class Super {

  private void display(String message) {
    System.out.println("Hello Super with message");
  }

  protected void display() {
    System.out.println("Hello Super class");
  }
}

class Sub extends Super {

  public void display() {
    System.out.println("Hello World");
  }

  private void display(String message) {
    System.out.println("Hello private Sub class with message");
  }

  public void runPrivate() {
    display("hello");
  }
}

class TV {

  public void switchOn() {
    System.out.println("TV is switched on");
  }

  public void changeChannel() {
    System.out.println("Tv's channel is changed");
  }
}

class SmartTV extends TV {

  @Override
  public void switchOn() {
    System.out.println("SmartTV swtiched on");
  }

  @Override
  public void changeChannel() {
    System.out.println("SmartTV's channel is changed");
  }

  public void browse() {
    System.out.println("SmartTV is browsing");
  }
}

class Animal {

  String defaultSound = "default sound"; // Default access
  protected String protectedSound = "protected sound";

  void makeDefaultSound() {
    // Default
    System.out.println(defaultSound);
  }

  protected void makeProtectedSound() {
    // Protected
    System.out.println(protectedSound);
  }
}

class ZooKeeper {

  // Same package, not subclass
  void interact(Animal a) {
    a.makeDefaultSound(); // ✅ Works - same package
    a.makeProtectedSound(); // ✅ Works - same package
    System.out.println(a.defaultSound); // ✅ Works
    System.out.println(a.protectedSound); // ✅ Works
  }
}

class InnerOverriding {

  protected String name = "ahnaf";
}

class SubInnerOverriding extends InnerOverriding {}

class SubSubInnerOverriding extends SubInnerOverriding {

  public void displayName() {
    System.out.println(name);
  }
}
