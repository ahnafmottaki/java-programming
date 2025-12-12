public class InnerPractice {

  public static void main(String[] args) {
    System.out.println("Writting inner classes");
    Outer o1 = new Outer();
    o1.useInner();
    // creating inner class outside outer
    Outer.Inner oi1 = new Outer().new Inner("inner2");
    oi1.getOuterClassName();
    oi1.belongsTo();

    // creating annonymous inner class
    Phone p1 = new Phone() {
      public String name;

      void setName(String name) {
        this.name = name;
      }

      String getName() {
        return name;
      }

      @Override
      public void sendMsg(String msg, double number) {
        System.out.println(msg + " is sent to number " + number);
      }
    };
    p1.sendMsg("good morning", 8801730914235d);
  }
}

interface Phone {
  void sendMsg(String msg, double number);
}

class Outer {

  String className = "outer";

  void useInner() {
    Inner i1 = new Inner("inner1");
    i1.belongsTo();
    System.out.println(i1.getOuterClassName());
  }

  class Inner {

    String className;

    public Inner(String className) {
      this.className = className;
    }

    void belongsTo() {
      System.out.println("This class belongs to " + className);
    }

    String getOuterClassName() {
      return className;
    }
  }
}
