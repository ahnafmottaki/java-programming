public class Inheritence {

  public static void main(String[] args) {
    Cylindar c1 = new Cylindar(2, 5);
    System.out.println(c1.area());
  }
}

class Circle {

  private double radius;

  public Circle() {
    this(1);
    System.out.println("Non-parameterized circle");
  }

  public Circle(double radius) {
    this.radius = radius;
    System.out.println("Parameterized circle");
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  public double permteter() {
    return 2 * Math.PI * radius;
  }
}

class Cylindar extends Circle {

  private double height;

  public Cylindar() {
    this(1, 1);
  }

  public Cylindar(double height) {
    this(1, height);
  }

  public Cylindar(double radius, double height) {
    System.out.println("parameterized cylindar");
    // super(radius);
    this.height = height;
  }

  public double volume() {
    return area() * height;
  }
}
