public class WithMonitor {

  public static void main(String[] args) {
    System.out.println("Synchronization with monitor");
    MyData data = new MyData();
    MyThreadOne mto = new MyThreadOne(data);
    MyThreadTwo mtt = new MyThreadTwo(data);
    mto.start();
    mtt.start();
  }
}

class MyData {

  public synchronized void display(String s) {
    // synchronized (this) {
    for (int i = 0; i < s.length(); ++i) {
      System.out.println(s.charAt(i));
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {}
    }
    // }
  }
}

class MyThreadOne extends Thread {

  MyData d;

  public MyThreadOne(MyData d) {
    this.d = d;
  }

  @Override
  public void run() {
    d.display("xxxxxxxxxxxxxxx");
  }
}

class MyThreadTwo extends Thread {

  private MyData d;

  public MyThreadTwo(MyData d) {
    this.d = d;
  }

  @Override
  public void run() {
    d.display("ggggggggggggggg");
  }
}
