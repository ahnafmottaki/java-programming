import java.awt.Color;

public class WrittingClasses {

  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.radius = 45;
    System.out.println(c1.area());
    System.out.println(c1.permteter());
  }
}

class Circle {

  public double radius;

  public double area() {
    return Math.PI * radius * radius;
  }

  public double permteter() {
    return 2 * Math.PI * radius;
  }
}

class Rectangle {

  public int length;
  public int breadth;

  public int area() {
    return length * breadth;
  }

  public int perimeter() {
    return 2 * (length + breadth);
  }

  public boolean isSquare() {
    return length == breadth;
  }
}

class Cylinder {

  public double radius;
  public double height;

  public double lidArea() {
    return 45;
  }

  public double surfaceAra() {
    return 45;
  }

  public double volume() {
    return 43;
  }
}

class Student {

  public int rollno;
  public String name;
  public String course;
  public int m1, m2, m3, m4;

  public int total() {
    return m1 + m2 + m3 + m4;
  }

  public float average() {
    return total() / 4;
  }
}

class Account {

  public long accNo;
  public String name;
  public double balance;

  public void deposit(int amt) {}

  public void withdraw(int amt) {}
}

class Car {

  public String name;
  public String regNo;
  public Color col;
  public double fuelQty;

  public void start() {}

  public void stop() {}

  public void accelerate() {}

  public void changeGear() {}
}
