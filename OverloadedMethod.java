public class OverloadedMethod {

  static float getArea(int length, int breadth) {
    float area = length * breadth;
    return area;
  }

  static double getArea(int radius) {
    double area = Math.PI * radius * radius;
    return area;
  }

  static int reverse(int temp) {
    int reversed = 0;
    while (temp != 0) {
      int modulus = temp % 10;
      reversed = reversed * 10 + modulus;
      temp /= 10;
    }
    return reversed;
  }

  static int[] reverse(int[] arr) {
    int[] reversed = new int[arr.length];
    for (int i = 0; i < arr.length; ++i) {
      reversed[arr.length - 1 - i] = arr[i];
    }
    return reversed;
  }

  public static void main(String[] args) {
    System.out.println(reverse(56));
    int[] X = { 3, 43, 2 };
    System.out.print("[");
    for (int x : reverse(X)) {
      System.out.printf("%d ,", x);
    }
    System.out.println("]");
  }
}
