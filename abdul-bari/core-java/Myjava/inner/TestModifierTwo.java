package Myjava.inner;

import Myjava.Student;

public class TestModifierTwo {

  public void test() {
    Student s1 = new Student("ahnaf mottaki", "mathemetics");
    System.out.println(s1.name);
    System.out.println(s1);
  }

  public void show() {
    System.out.println("Hello from demo2-myjava-inner-pacakge");
  }
}

class MyInnerStudentPack extends Student {

  class MyInnerProtectedClass {

    public MyInnerProtectedClass() {
      System.out.println("from MyinnerStudentPack");
    }
  }

  public MyInnerStudentPack(String name, String department) {
    super(name, department);
    MyInnerStudentPack.MyInnerProtectedClass mt1 =
      this.new MyInnerProtectedClass();
  }
}
