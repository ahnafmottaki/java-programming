public class BasicThreading {

  public static void main(String[] args) {
    // MyThread myt = new MyThread();

    // Thread m1 = new Thread(myt);
    // m1.start();
    // int x = 0;
    // while (true) {
    //   System.out.println(x++ + " World");
    // }
    Runnable mr1 = new Runnable() {
      @Override
      public void run() {
        int x = 0;
        while (true) {
          System.out.println(x++ + "Hello World!");
        }
      }
    };
    Thread th1 = new Thread(mr1);
    th1.start();
    int y = 0;
    while (true) {
      System.out.println(y++ + "Gunda Mastan");
    }
  }
}

class MyThread implements Runnable {

  @Override
  public void run() {
    int i = 1;
    while (true) {
      System.out.println(i++ + " Hello");
    }
  }
}

class MyRunnable implements Runnable {

  @Override
  public void run() {
    for (int x = 0; x < 10; ++x) {
      System.out.println(x);
    }
  }
}
