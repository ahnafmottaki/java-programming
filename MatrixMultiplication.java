import java.lang.reflect.Method;

public class MatrixMultiplication {

  public static int[][] multiply(int[][] A, int[][] B) {
    if (A[0].length != B.length) {
      throw new IllegalArgumentException("Matrix dimensions do not match");
    }
    int[][] C = new int[A.length][B[0].length];
    for (int i = 0; i < C.length; ++i) {
      for (int j = 0; j < C[0].length; ++j) {
        int aij = 0;
        for (int k = 0; k < A[0].length; ++k) {
          aij += (A[i][k] * B[k][j]);
        }
        C[i][j] = aij;
      }
    }
    return C;
  }

  public static void change(String x) {
    x = "ahnaf";
  }

  public static void main(String[] args) {
    System.out.println("Matrix Multiplication");
    int[][] A = { { 1, 2 } };
    int[][] B = { { 1, 2 } };
    int[][] C = multiply(A, B);
    for (var i : C) {
      System.out.print("[");
      for (var j : i) {
        System.out.printf("%d ,", j);
      }
      System.out.print("]\n");
    }
  }
}
