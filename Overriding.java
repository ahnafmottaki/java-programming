public class Overriding {

  public static void main(String[] args) {
    Super s1 = new Sub();
    // s1.display("ahnaf");
    s1.display();
  }
}

class Super {

  public void display(String message) {
    System.out.println("Hello Super with message");
  }

  public void display() {
    System.out.println("Hello Super class");
  }
}

class Sub extends Super {

  public void display(String message) {
    System.out.println("Hello Sub class with message");
  }
}
