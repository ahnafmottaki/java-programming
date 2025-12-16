public class MyException {

  public static void main(String[] args) {
    try {
      int a[] = { 10, 0, 8, 3, 5 };
      int r;
      if (a[1] == 0) {
        throw new MinBalanceException();
      }
      r = a[0] / a[1];
      System.out.println(r);
      System.out.println(a[10]);
    } catch (MinBalanceException e) {
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println("Devided by zero, " + e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("array is out of bound" + e);
    } finally {}
  }
}

class MinBalanceException extends Exception {

  @Override
  public String getMessage() {
    return "Min balance excedded";
  }

  @Override
  public String toString() {
    return "Min balance excedded";
  }
}
