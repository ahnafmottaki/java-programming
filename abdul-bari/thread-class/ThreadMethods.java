// class MyRun implements Runnable {

//   @Override
//   public void run() {}
// }

class MyThread extends Thread {

  public MyThread(String name) {
    super(name);
    // setPriority(Thread.MAX_PRIORITY);
  }

  @Override
  public void run() {
    int count = 1;
    while (true) {
      System.out.println(count++);
    }
  }
}

public class ThreadMethods {

  public static void main(String[] args) throws Exception {
    System.out.println(
      "Learning thread constructors, instance methods, getters , setters and static methods"
    );
    MyThread my1 = new MyThread("my-thread");
    // System.out.println("ThreadName: " + my1.getName());
    // getId deprecated
    // System.out.println("ThreadId: " + my1.getId());
    // System.out.println("Thread priority: " + my1.getPriority());
    my1.setDaemon(true);
    my1.start();
    Thread mainThread = Thread.currentThread();
    mainThread.join();
    // try {
    //   Thread.sleep(100);
    // } catch (Exception e) {
    //   System.out.println(e);
    // }
    // my1.interrupt();
    // System.out.println("Thread State: " + my1.getState());
    // System.out.println("Thread alive: " + my1.isAlive());
  }
}
