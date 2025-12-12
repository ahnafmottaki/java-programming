import Myjava.Student;

public class LearningAccessModifiers {

  public static void main(String[] args) {
    // this is called has a relationship
    Student s1 = new Student("ahnaf mottaki", "mathmetics");
    // protected member roll won't be access with a has a relationship
    // s1.roll -> not accessible
    // default roll won't be accessible with a has a relationshipt
    // s1.department -> not accessible
    // private memeber are accessbile only inside the class
    // public members are availabe anywhere
    System.out.println(s1.name);
    Student s2 = new Captain("fuad biccu", "hishabbiggan");
  }
}

// now we will show the accesslevel in a isA relationship
class Captain extends Student {

  public Captain(String name, String department) {
    super(name, department);
    // protected and public members are available'
  }
}
