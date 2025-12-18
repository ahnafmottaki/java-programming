class MyObject extends Object {

  @Override
  public String toString() {
    return "My Object";
  }

  @Override
  public int hashCode() {
    return 4783423;
  }

  public boolean equals(Object o) {
    return hashCode() == o.hashCode();
  }
}

public class ObjectClass {

  public static void main(String[] args) {
    System.out.println("Learning java object class");
    System.out.println(
      "Every class is directly or indirectly inheriting from Object class"
    );
    System.out.println("Object class is the Mother of all classes");
    Object o1 = new Object();
    Object o2 = new Object();
    System.out.println(o1.equals(o2));
    System.out.println(o1.hashCode());
    System.out.println(o1);
    MyObject m1 = new MyObject();
    MyObject m2 = new MyObject();
    System.out.println(m1.hashCode());
    System.out.println(m2.hashCode());
    System.out.println(m1.equals(m2));
  }
}
