import java.awt.Color;

public class WrittingClasses {

  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.radius = 45;
    System.out.println(c1.area());
    System.out.println(c1.permteter());
    Rectangle r1 = new Rectangle(10, 15);
    System.out.println(r1.area());

    // creating array of objects
    Rectangle[] rectangles = new Rectangle[3];
    for (int i = 0; i < rectangles.length; ++i) {
      rectangles[i] = new Rectangle(13 * (i + 1), 22 * (i + 1));
    }
    for (var rect : rectangles) {
      System.out.println(rect);
    }
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

  private int length;
  private int breadth;

  public Rectangle() {
    System.out.println("non-parameterized constructor is called");
    length = 1;
    breadth = 1;
  }

  public Rectangle(int s) {
    System.out.println("Single parameter constructor is called");
    length = breadth = s;
  }

  public Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    if (length > 0) {
      this.length = length;
    } else {
      this.length = 0;
    }
  }

  public int area() {
    return length * breadth;
  }

  public int perimeter() {
    return 2 * (length + breadth);
  }

  public boolean isSquare() {
    return length == breadth;
  }

  public String toString() {
    return "length is: " + length + " , breadth is: " + breadth;
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
