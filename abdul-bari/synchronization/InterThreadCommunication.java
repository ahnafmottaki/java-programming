public class InterThreadCommunication {

  public static void main(String[] args) {
    System.out.println("Inter thread communication");
    MyData d1 = new MyData();
    Producer p1 = new Producer(d1);
    Consumer c1 = new Consumer(d1);
    p1.start();
    c1.start();
  }
}

class MyData {

  private boolean flag = false;
  private int x = 0;

  public synchronized int getX() {
    int value = 0;
    while (flag != true) {
      try {
        wait();
      } catch (InterruptedException e) {}
    }
    value = x;
    flag = false;
    notify();
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {}
    return value;
  }

  public synchronized void setX(int x) {
    while (flag != false) {
      try {
        wait();
      } catch (InterruptedException e) {}
    }
    this.x = x;
    flag = true;
    notify();
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {}
  }
}

class Producer extends Thread {

  MyData d;

  public Producer(MyData d) {
    this.d = d;
  }

  @Override
  public void run() {
    int i = 0;
    while (true) {
      d.setX(i);
      System.out.println("Producer " + i++);
    }
  }
}

class Consumer extends Thread {

  MyData d;

  public Consumer(MyData d) {
    this.d = d;
  }

  @Override
  public void run() {
    while (true) {
      System.out.println("Consumer " + d.getX());
    }
  }
}
