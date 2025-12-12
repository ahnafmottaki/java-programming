public class Abstract {

  public static void main(String[] args) {
    System.out.println("Learning abstract class");
    SuperClass s1 = new SubClass();
    s1.meth1();
    s1.meth2();

    KFC k1 = new MyKFC();
    k1.billing();
    k1.offer();
  }
}

abstract class SuperClass {

  public SuperClass() {
    System.out.println("SuperClass constructor is called");
  }

  public void meth1() {
    System.out.println("Method one of SuperClass");
  }

  public abstract void meth2();
}

class SubClass extends SuperClass {

  public void meth2() {
    System.out.println("Subclass method 2");
  }

  public void meth3() {
    System.out.println("SubClass method 3");
  }
}

abstract class KFC {

  public KFC() {
    System.out.println("KFC constructor");
  }

  void makeItem() {
    System.out.println("Making KFC item");
  }

  abstract void billing();

  abstract void offer();
}

class MyKFC extends KFC {

  void billing() {
    System.out.println("billing of myKfc outlet");
  }

  void offer() {
    System.out.println("offers of myKfc outlet");
  }
}

abstract class Shape {

  abstract double perimeter();

  abstract double area();
}

class Circle extends Shape {

  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  double perimeter() {
    return Math.PI * 2 * radius;
  }

  double area() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {

  public double length;
  public double breadth;

  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  double perimeter() {
    return 2 * (length + breadth);
  }

  double area() {
    return length * breadth;
  }

  boolean isSquare() {
    return length == breadth;
  }
}
