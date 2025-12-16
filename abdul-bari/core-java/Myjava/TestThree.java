package Myjava;

import Myjava.Student;

public class TestThree {

  public void display() {
    Student.protectedMethod();
    Student.defaultMethod();
    Student s1 = new Student("name", "department");
    Student.MyInnerPackagePrivateClass myInPackPrivateTwo =
      s1.new MyInnerPackagePrivateClass();
    Student.MyInnerProtectedClass myInprotected =
      s1.new MyInnerProtectedClass();
    Student.MyInnerPackagePrivateClass myInPackPrivateOne = new Student(
      "name",
      "department"
    ).new MyInnerPackagePrivateClass();
    Student.MyInnerProtectedClass myInProtectedOne = new Student(
      "name",
      "department"
    ).new MyInnerProtectedClass();
  }
}
