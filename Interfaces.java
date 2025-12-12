public class Interfaces {

  public static void main(String[] args) {
    System.out.println("Learning interfaces");
    Test t1 = new TestClass();
    t1.methodOne();
    t1.interfaceMethod();
    Store s1 = new Store();
    Customer c1 = new Customer("ahnaf");
    Customer c2 = new Customer("mottaki");
    s1.register(c1);
    s1.register(c2);
    s1.inviteCode();
    Test.log();
    System.out.println(Test.X);
  }
}

interface Test {
  int X = 10;

  static void log() {
    System.out.println("Static method of Text interface");
  }

  default void interfaceMethod() {
    System.out.println("This is the default method of interface Test");
  }

  void methodOne();
  void methodTwo();
}

class TestClass implements Test {

  public void interfaceMethod() {
    System.out.println("This is overrided method of interface method ");
  }

  public void methodOne() {
    System.out.println("Method one of TestClass");
  }

  public void methodTwo() {
    System.out.println("Method two of TestClass");
  }

  public void methodThree() {
    System.out.println("Method three of TestClass");
  }
}

interface Member {
  void callback();
}

class Customer implements Member {

  String name;

  public Customer(String name) {
    this.name = name;
  }

  public void callback() {
    System.out.println("Ok, I will visit " + name);
  }
}

class Store {

  Member mem[] = new Member[100];
  int count = 0;

  void register(Member M) {
    mem[count++] = M;
  }

  void inviteCode() {
    for (int i = 0; i < count; ++i) {
      mem[i].callback();
    }
  }
}
