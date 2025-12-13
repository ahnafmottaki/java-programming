import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourceDemo {

  static FileInputStream file;

  public static void readFile() throws Exception {
    try (
      FileInputStream fi = new FileInputStream("test.txt");
      Scanner sc = new Scanner(fi)
    ) {
      file = fi;
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println(a / b);
      System.out.println("Readfile end");
    }
  }

  public static void main(String[] args) throws Exception {
    readFile();
    file.read();
  }
}
